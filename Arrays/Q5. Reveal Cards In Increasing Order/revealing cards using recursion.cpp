#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void reverseSimulation(vector<int>& result, vector<int>& deck, int index) {
    if (index < 0) return; // Base case

    if (index < result.size() - 1) {
        // Move the last placed element to the front (reversing the reveal process)
        int last = result.back();
        result.pop_back();
        result.insert(result.begin(), last);
    }

    // Place the next largest element in the last position
    result.back() = deck[index];

    // Recursive call for the next element
    reverseSimulation(result, deck, index - 1);
}

vector<int> revealCardsInIncreasingOrder(vector<int>& deck) {
    sort(deck.begin(), deck.end()); // Step 1: Sort in ascending order
    vector<int> result(deck.size(), -1); // Placeholder array

    reverseSimulation(result, deck, deck.size() - 1); // Start placing from the largest
    return result;
}

int main() {
    int n;
    cout << "Enter the number of cards: ";
    cin >> n;

    vector<int> deck(n);
    cout << "Enter the card values: ";
    for (int i = 0; i < n; ++i) {
        cin >> deck[i];
    }

    vector<int> result = revealCardsInIncreasingOrder(deck);

    cout << "Revealed order: ";
    for (int card : result) {
        cout << card << " ";
    }
    cout << endl;

    return 0;
}
