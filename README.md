# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
   A list of dogs(A collection) //List<Dog> dogs = new ArrayList<Dog>(); 
   3 instances of dog class
   A comparator for dog
3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
       It is this part in MyCompare3.java:
    	Collections.sort(dogs, new Comparator<Animal>(){
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
		}); 