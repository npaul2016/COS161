// Java collections frameworks : check out what that means
// programs that counts the number of unique words in a large text file ( say, moby dick or the king james bible)
// store the words in a collections and report the # of unique ids

// Empirical analysis

System.currentTimeMillis()

//Sets: a collections of unit values, or set of elements ( no duplicate allowed)
// they don't have indexes, you want to know if the value of data exist or not with the stet

// Set implementation

Set Interface //in
java.util

//Set is implemented by */ HashSet and TreeSet

//  Set methods

list<String> list = new ArrayList<String> ();
..
set<Integer> set = new TreeSet<Integer>();
Set<String> set2 = new HashSet<String>(list);

- can construct an empty set, or one based on a given collection.

//Set Operations

addAll, retainAll, removeAll


//Sets and Ordering

//HashSet: elements are stored in an unpredictable order

import java.util.*;

public final class SetMapExample {


  public static void public static void main(String[] args) {

  }

  Set<String> names = new HashSet<String>();

  names.add("Jakes");
  names.add("Robert");
  names.add("Marisa");
  names.add("Kasey");

  System.out.println("names");
}

Set<String> names2 = new TreeSet<String>(names);
System.out.println(names2);

Set<String> names3= new HashSet<String>(names);
System.out.println(names3);


// [ Kasey, Robert, Jakes, Marisa]


//The "for each " loop ( 7.10)

for ( type name : collection) {
statements;
}

//Maps: keys then functions ( maps are like )

put( key, value ): adds a mapping from a key to a value
get(key); retrieves the value mapped to the key.
remove(key): removes the give key and its mapped value

// maps and tallying
// the index key doesn't have to be an int

// recall prevous tallying examples from CSE 143
/// count digits: 22092310907

// Map implementation

Map interface in java.util
implemented by HashMap and TreeMap classes

Maps methods (list )


// using maps : a map allow to get from one half of a parir to the other

get.names ( //then it gives you an ID)



//Exercice > read a file into a map of [word -- > number of occurences]

Scanner input = new Scanner (new File ) ("mobydick.txt");

while (input.hasNext);

String word = input.next();

if wordCount
