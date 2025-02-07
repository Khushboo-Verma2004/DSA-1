class Solution:
    def mergeInBetween(self, list1, a, b, list2):
        def find_nodes(node, index):
            if index == a - 1:
                return node
            return find_nodes(node.next, index + 1)

        def get_tail(node):
            if not node.next:
                return node
            return get_tail(node.next)

        start = find_nodes(list1, 0)
        end = start.next
        for _ in range(b - a + 1):
            end = end.next

        start.next = list2
        get_tail(list2).next = end

        return list1
