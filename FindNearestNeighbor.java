/**
* Given an array and an an index of the array, find the nearest
* index in which the value is greater than the value of the
* index that is passed in.
*/
public int findNearestHigherNumber(int[] array, int index) {
    int currentValue = array[index];
    List<int> greaterValues = new ArrayList<int>();
    int distanceBetween = 0;
    int result = 0;
    for(int i = 0; i <= array.length; i++) {
        if (array[i] > currentValue) {
            greaterValues.push(i);
        }
    }

    distanceBetween = Math.abs(current - greaterValues.get(0));

    for (int i = 0; i <= greaterValues.length; i++) {
        if(Math.abs(greaterValues.get(i) - currentValue) < distanceBetween) {
            distanceBetween = Math.abs(current - greaterValues.get(i));
            result = greaterValues.get(i);
        }
    }
    return result;
}


@Test
public void TestFindNearestNeighborReturnsNearestNeighbor() {
    int [] test = { 0 , 1, 2, 3};
    int index = 2;

    assertEquals(findNearestHigherNumber(test, index), 3)
}