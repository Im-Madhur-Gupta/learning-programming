import random

for n in range(1, int(input()) + 1):
    with open(f'input{n}.txt', 'w') as f:
        T = random.randint(1, 100)
        f.write(f'{T}\n')
        for _ in range(T):
            L, K = random.randint(1, 100000), random.randint(1, 1000)
            f.write(f'{L} {K}\n')
            for _ in range(K):
                p, h = random.randint(1, L), random.randint(-(10**5), 10**5)
                s = random.choice(['+', '-'])
                f.write(f'{p} {h} {s}\n')