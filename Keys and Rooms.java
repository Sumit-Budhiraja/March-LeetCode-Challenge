class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int roomsCount = rooms.size();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> bfsQueue = new LinkedList<>();

        visited.add(0);
        bfsQueue.add(0);

        while (!bfsQueue.isEmpty()) {
            int currentRoom = bfsQueue.poll();

            for (int nextRoom : rooms.get(currentRoom)) {
                if (!visited.contains(nextRoom)) {
                    visited.add(nextRoom);
                    bfsQueue.add(nextRoom);
                }
            }
        }

        return visited.size() == roomsCount;
    }
}