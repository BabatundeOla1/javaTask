tuitionfee = float(input("Enter tuition Fee amount: "))
rate = float(input("Enter annual interest rate: "))
year = int(input("Enter duration: "))

PERCENTAGE = 100
annual_interest = rate / PERCENTAGE

print("Years","\t","Yearly amount")

for year in range(1, year + 1):

	yearlyIncrementAmount = annual_interest * tuitionfee
	totalAmountPerYear = tuitionfee + yearlyIncrementAmount
	tuitionfee = totalAmountPerYear

	print(f"Year:{year}\t{tuitionfee:,.2f}")











