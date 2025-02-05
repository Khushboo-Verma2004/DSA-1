#include <iostream>
using namespace std;

// Definition for singly-linked list
struct ListNode {
    int val;
    ListNode* next;
    
    ListNode(int value) {
        val = value;
        next = nullptr;
    }
};

class Solution {
public:
    int getDecimalValue(ListNode* head) {
        int num = 0;
        while (head != nullptr) {
            num = (num << 1) | head->val; // Left shift and add current bit
            head = head->next;
        }
        return num;
    }
};

int main() {
    // Creating a linked list: 1 -> 0 -> 1 (Binary 101)
    ListNode* head = new ListNode(1);
    head->next = new ListNode(0);
    head->next->next = new ListNode(1);

    Solution solution;
    cout << "Decimal Value: " << solution.getDecimalValue(head) << endl; // Output: 5

    return 0;
}
