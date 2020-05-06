def solution(num):
    stripped_binary = bin(num).split('b')[1].strip('0')

    biggest_gap = 0
    count = 0
    for c in stripped_binary:
        if c == '1':
            count = 0
        elif c == '0':
            count += 1
            if count > biggest_gap:
                biggest_gap = count

    return biggest_gap


num = int('001001010001', 2)
print(num)
ans = solution(num)
print(ans)
