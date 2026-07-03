class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentTank = 0;
        int startStation = 0;
        
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentTank += gas[i] - cost[i];
            
            // If the car runs out of gas at the current station
            if (currentTank < 0) {
                // Pick the next station as the new starting point candidate
                startStation = i + 1;
                // Reset the running tank for the new journey
                currentTank = 0;
            }
        }
        
        // If total gas is less than total cost, a full circuit is impossible
        if (totalGas < totalCost) {
            return -1;
        }
        
        return startStation;
    }
}