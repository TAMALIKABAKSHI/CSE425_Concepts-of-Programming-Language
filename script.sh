#!/bin/bash

start=$(date +%s.%N)

selection=
	echo " 
Dataset: Heart Attack Analysis $ Prediction 
Topic  : heart attack classification

Choose your searching term :
	1  - By Age
	2  - By Gender 
	3  - By Chest Pain Type (cp)
	4  - By Resting Blood Pressure (trtbps)
	5  - By Cholestoeal (chol)
	6  - By Fasting Blood Sugar(fbs)
	7  - By Resting ECG (restecg)
	8  - By Maximum Heart Rate (thalach)
	9  - By Exercise Induced Angina (exng)
	10 - By Previous Peak(oldpeak)
	
Choose your sorting term :	
	11 - By Age
	12 - By Resting Blood Pressure (trtbps)
	13 - By Fasting Blood Sugar(fbs)
	14 - By Previous Peak(oldpeak)
			
0 - Exit program
"
	echo -n "Enter Term Number: "
	read selection
	echo ""
	
	start=$(date +%s.%N)
	
	if [ "$selection" -eq 1 ]
	then
	echo -n "Enter Age (Between 29-77) : "
	read pattern; awk -v patt="$pattern" -F',' '$1 == patt' heart.csv 
	
	elif [ "$selection" -eq 2 ]
	then
	echo -n "Enter Gender(0 or 1) : "
	read pattern; awk -v patt="$pattern" -F',' '$2 == patt' heart.csv
	
	elif [ "$selection" -eq 3 ]
	then
	echo -n "Chest Pain Type(0-3) : "
	read pattern; awk -v patt="$pattern" -F',' '$3 == patt' heart.csv
	
	elif [ "$selection" -eq 4 ]
	then
	echo -n "Resting Blood Pressure(94-200) : " 
	read pattern; awk -v patt="$pattern" -F',' '$4 == patt' heart.csv 
	
	elif [ "$selection" -eq 5 ]
	then
	echo -n "Colestoral (126-564 ): " 
	read pattern; awk -v patt="$pattern" -F',' '$5 == patt' heart.csv 

	elif [ "$selection" -eq 6 ]
	then
	echo -n "Fasting Blood Sugar > 120( 1 = true, 0 = False) : " 
	read pattern; awk -v patt="$pattern" -F',' '$6 == patt' heart.csv 
	
	elif [ "$selection" -eq 7 ]
	then
	echo -n "Resting ECG(1-2) : " 
	read pattern; awk -v patt="$pattern" -F',' '$7 == patt' heart.csv

	elif [ "$selection" -eq 8 ]
	then
	echo -n "Maximum Heart Rate( 71-202) : " 
	read pattern; awk -v patt="$pattern" -F',' '$8 == patt' heart.csv 
	
	elif [ "$selection" -eq 9 ]
	then
	echo -n "Exercise Induced angine (1 = yes, 0 = no) : " 
	read pattern; awk -v patt="$pattern" -F',' '$9 == patt' heart.csv 

	elif [ "$selection" -eq 10 ]
	then
	echo -n "Previous Peak(0-6.2): " 
	read pattern; awk -v patt="$pattern" -F',''$10 == patt' heart.csv 
	
	elif [ "$selection" -eq 11 ]
	then
	sort -t, -k1 heart.csv
	
	elif [ "$selection" -eq 12 ]
	then
	sort -t, -k4 heart.csv
	
	elif [ "$selection" -eq 13 ]
	then
	sort -t, -k6 heart.csv
	
	elif [ "$selection" -eq 14 ]
	then
	sort -t, -k10 heart.csv
		
	else
	echo "No data Avaiable"
	fi
	
end=$(date +%s.%N)    
runtime=$(python -c "print(${end} - ${start})")
echo "Runtime was $runtime"
