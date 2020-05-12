import time


def time_decorator(func):
    def wrapper_func(*args, **kwargs):
        t1 = time.time()
        result = func(*args, **kwargs)
        t2 = time.time()
        print('{}() function total run time: {}'.format(func.__name__, t2 - t1))
        return result
    return wrapper_func


@time_decorator
def solution(X, A):
    leaf_set = set(range(1, X + 1))

    count = 0
    for leaf in A:
        leaf_set.discard(leaf)
        if len(leaf_set) == 0:
            return count
        count += 1

    return -1


print('Starting...')
X = 5
A = [1, 3, 1, 4, 2, 3, 5, 4]

ans = solution(X, A)

print('ans: {}'.format(ans))
print('Finished.')
