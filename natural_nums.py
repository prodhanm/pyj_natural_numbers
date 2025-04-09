def sum_nums(n):
    result = (n*(n+1))/2
    return result

def main():
    num = int(input("Enter the value of a number: "))
    natural_sum = int(sum_nums(num))
    print(f"The first total of the sum of natural numbers is {natural_sum}")

if __name__ == "__main__":
    main()