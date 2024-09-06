
def find_max_and_count():
    numbers = input("Enter a number: ")
    if numbers == '0':
        print("No numbers were entered except 0.")
        return

    max_num = max(numbers)
    count = numbers.count(max_num)

    print(f"The largest number is {max_num}")
    print(f"The occurrence count of the largest number is {count}")

find_max_and_count()


