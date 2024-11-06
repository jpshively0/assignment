int[] average_grades(int grades[][], int weights[]){

int y = grades.length;
int[] temp = new int[y];


for(int j = 0; j < grades.length; j++){
for(int i = 0; i < grades[0].length; i++){

temp[j] += (grades[j][i] * weights[i]);

}

	}

// loop to divide by 100
for(int k = 0; k < temp.length; k++){


temp[k] = temp[k]/100;


}


return temp;


											}


//multiply each grade by its corresponding
//weight, then divide the total by 100.
