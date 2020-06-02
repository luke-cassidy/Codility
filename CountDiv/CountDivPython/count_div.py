from time import time


def timer_decorator(orig_func):
    def wrapper_func(*args, **kwargs):
        t1 = time()
        result = orig_func(*args, **kwargs)
        t2 = time()
        print('{}() function executed in {} ms'. format(
            orig_func.__name__, (t2 - t1) * 1000))
        return result
    return wrapper_func


@timer_decorator
def solution(A, B, K):
    inv_mod_0A = -A % K
    mod_0B = B % K

    A_adj = A + inv_mod_0A
    B_adj = B - mod_0B

    return int((B_adj - A_adj) / K + 1)


print('-------------------------')
A = 6
B = 11
K = 2

print('args -> A: {}, B: {}, K: {}'.format(A, B, K))
result = solution(A, B, K)

print('result: {}'.format(result))
print('-------------------------')
