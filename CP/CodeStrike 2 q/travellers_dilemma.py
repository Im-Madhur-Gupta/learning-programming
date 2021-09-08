from math import ceil, floor


def calcProd(l):
    return l[0] + sum(tuple(i * j for i, j in zip(l, l[1:]))) + l[-1]


for _ in range(int(input())):
    v, e = map(int, input().split())

    if v % 2 > 0:
        eves = range(2, v + 1, 2)
        odds = range(v, 1, -2)
        final = []

        for i in range(len(eves)):
            final.append(odds[i])
            final.append(eves[i])
    else:
        eves = range(v, 1, -2)
        odds = range(3, v, 2)
        final = []

        result_eve = [None] * len(eves)
        result_eve[::2] = eves[:ceil(len(eves) / 2)]
        result_eve[1::2] = reversed(eves[ceil(len(eves) / 2):])

        result_odd = [None] * len(odds)
        result_odd[1::2] = odds[:floor(len(odds) / 2)]
        result_odd[::2] = reversed(odds[floor(len(odds) / 2):])
        result_odd.reverse()

        final.extend(result_eve)
        final.extend(result_odd)

    te = calcProd(final)
    print(te <= e)
