import time
import random

start_time = time.time()

correct_answer = 0
wrong_answer = 0
right_answer = 0

userinput = int(input("How many questions do you want to answer? "))

for questions in range(userinput):
	question1 = random.randint(1, 100)
	question2 = random.randint(1, 100)

	if question1 > question2:
		temp = question1
		question1 = question2
		question2 = question1
		
		right_answer = question2 + question1
	
	answer = int(input(f"Answer This question {question2} + {question1}? "))

	end_time = time.time()

	if answer == right_answer:
		correct_answer += 1
		print("You  are correct. The answer is = ", right_answer)

	if answer != right_answer:
		wrong_answer += 1
		print("You  are wrong. The answer is = ", right_answer)

	total_time_used = end_time - start_time

print(f"Total Time used on test:  {total_time_used:,.2f}seconds")
print("Correct answers: ", correct_answer)
print("Wrong answers: ", wrong_answer)





