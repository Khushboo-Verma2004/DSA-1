
class Solution {
public:
    int carFleet(int target, vector<int>& position, vector<int>& speed) {
        vector<pair<int, double>> cars;
        int n = position.size();
        
        for (int i = 0; i < n; i++) {
            cars.push_back({position[i], (double)(target - position[i]) / speed[i]});
        }

        sort(cars.begin(), cars.end(), [](const pair<int, double>& a, const pair<int, double>& b) {
            return a.first > b.first;
        });

        stack<double> fleet;
        
        for (auto& car : cars) {
            if (fleet.empty() || fleet.top() < car.second) {
                fleet.push(car.second);
            }
        }
        
        return fleet.size();
    }
};
