public class NuevasPruebas {
    public MyDynamicArray fillTestArr(int numOfLines) {
        MyDynamicArray arr = new MyDynamicArray(2);
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        for (int i = 0; i < numOfLines; i++)
            arr.pushBack(reader.returnString());
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "pushBack (full)", (stopTime - startTime)/1e9);
        System.out.println(text);
        return arr;
    }
    public MyDynamicArray removeTestArr(MyDynamicArray arr) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        String[] popped = arr.remove(arr.size-1);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "remove (uno)", (stopTime - startTime)/1e9);
        System.out.println(text);
        arr.pushBack(popped);
	return arr;
        
    }
    public MyDynamicArray sortTestArr(MyDynamicArray arr, int key) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        arr.sort(key);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "sort", (stopTime - startTime)/1e9);
        System.out.println(text);
        return arr;
    }
    public MyDynamicArray searchTestArr(MyDynamicArray arr, String data, int key) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        arr.search(data, key);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "search", (stopTime - startTime)/1e9);
        System.out.println(text);
        return arr;
    }
    public BinarySearchTree fillTestBST(int numOfLines) {
        BinarySearchTree bst = new BinarySearchTree();
        paraleer reader = new paraleer(); 
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        for (int i = 0; i < numOfLines; i++)
            bst.insertBST(reader.returnString(), 4);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "insertBST (full)", (stopTime - startTime)/1e9);
        System.out.println(text);
        return bst;
    }
    public BinarySearchTree removeTestBST(BinarySearchTree bst, String data, int key) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        bst.removeBST(data, key);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "removeBST (uno)", (stopTime - startTime)/1e9);
        System.out.println(text);
	return bst;
    }
    public BinarySearchTree sortTestBST(BinarySearchTree bst, int key) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        bst.sort(key);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "sortBST", (stopTime - startTime)/1e9);
        System.out.println(text);
        return bst;
    }
    public BinarySearchTree searchTestBST(BinarySearchTree bst, String data, int key) {
        long startTime, stopTime;
        String text;
        startTime = System.nanoTime();
        bst.searchBST(data, key);
        stopTime = System.nanoTime();
        text = String.format("Tiempo de %s, en segundos: %s", "searchBST", (stopTime - startTime)/1e9);
        System.out.println(text);
        return bst;
    }
}

/*
 * Ejemplo de pruebas
 * NuevasPruebas p = new NuevasPruebas();
        int[] tests = {10, 100, 1000, 10000, 100000, 113990};
        String data = "SB11201820582778";
        MyDynamicArray arr; BinarySearchTree bst;
        for (int i = 0; i < tests.length; i++) {
            System.out.println("=======================");
            int numOfLines = tests[i];
            arr = null;
            arr = p.fillTestArr(numOfLines);
            arr = p.removeTestArr(arr);
            arr = p.sortTestArr(arr, 4);
            p.searchTestArr(arr, data, 4);
            arr = null;
            System.out.println("-----------------------");
            bst = null;
            bst = p.fillTestBST(numOfLines);
            bst = p.removeTestBST(bst, data, 4);
            //bst = p.sortTestBST(bst, 4); Ojo, sort no
            p.searchTestBST(bst, data, 4);
            bst = null;
        }

 * */
