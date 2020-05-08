def solution(A, K):
    A_len = len(A)
    if A_len != 0:
        K = K % A_len

    A_rotate_start = A[:A_len - K]
    A_rotate_end = A[A_len - K:]
    return A_rotate_end + A_rotate_start


# array = [3, 8, 9, 7, 6]
# rotation = 0
# print('array: {}', array)
# ans = solution(array, rotation)
# print('ans: {}', ans)
