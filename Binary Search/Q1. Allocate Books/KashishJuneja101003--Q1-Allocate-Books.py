def is_valid(arr, n, m, max_allowed_pages):
    students, pages = 1, 0
    
    for i in range(n):
        if arr[i] > max_allowed_pages:
            return False
        
        if pages + arr[i] <= max_allowed_pages:
            pages += arr[i]
        else:
            students += 1
            pages = arr[i]
    
    return students <= m

def allocate_books(arr, n, m):
    if m > n:
        return -1  # Number of students can't be greater than the number of books
    
    total_pages = sum(arr)
    start, end = 0, total_pages
    result = -1
    
    while start <= end:
        mid = start + (end - start) // 2
        if is_valid(arr, n, m, mid):
            result = mid
            end = mid - 1
        else:
            start = mid + 1
    
    return result

# Example usage
arr = [12, 34, 67, 90]
n, m = 4, 2  # n -> number of books, m -> number of students
print(allocate_books(arr, n, m))
