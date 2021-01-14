n = int(input())
gmail_users = []
for _ in range(n):
    name, email= input().split()
    if email.endswith('@gmail.com'):
        gmail_users.append(name)

names.sort()
for user in gmail_users:
    print(user)
