package collection.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import collection.test.list.ArrayListTest;
import collection.test.list.LinkedListTest;
import collection.test.map.HashMapTest;
import collection.test.map.HashTableTest;
import collection.test.map.TreeMapTest;
import collection.test.set.HashSetTest;
import collection.test.set.TreeSetTest;

@RunWith(Suite.class)
@SuiteClasses({ ArrayListTest.class, LinkedListTest.class,
		HashSetTest.class, TreeSetTest.class, TreeMapTest.class,
		HashMapTest.class, HashTableTest.class })
public class CollectionTests {

}
