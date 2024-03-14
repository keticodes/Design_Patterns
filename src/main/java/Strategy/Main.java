package Strategy;

// Main.java
public class Main {
    public static void main(String[] args) {
        int[] smallDataset = generateRandomArray(30);
        int[] largeDataset = generateRandomArray(100000);

        testSortingAlgorithm("Merge Sort", new MergeSort(), smallDataset.clone());
        testSortingAlgorithm("Quick Sort", new QuickSort(), smallDataset.clone());
        testSortingAlgorithm("Heap Sort", new HeapSort(), smallDataset.clone());

        testSortingAlgorithm("Merge Sort", new MergeSort(), largeDataset.clone());
        testSortingAlgorithm("Quick Sort", new QuickSort(), largeDataset.clone());
        testSortingAlgorithm("Heap Sort", new HeapSort(), largeDataset.clone());
    }

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        return arr;
    }

    private static void testSortingAlgorithm(String algorithmName, SortingStrategy strategy, int[] dataset) {
        long startTime = System.nanoTime();
        strategy.sort(dataset);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println(algorithmName + " took " + duration + " milliseconds to sort the dataset.");
    }
}

