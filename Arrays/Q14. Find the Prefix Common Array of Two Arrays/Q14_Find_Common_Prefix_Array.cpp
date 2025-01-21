# include <iostream>
# include <vector>
using namespace std;

vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
    int n = A.size();
    vector<int> freq(n+1, 0);
    vector<int> C(n,0);
    int comcnt = 0;

    for(int i=0; i<n;++i){
        freq[A[i]]++;
        if(freq[A[i]] == 2){
            comcnt++;
        }          
        freq[B[i]]++;            
        if(freq[B[i]] == 2){
            comcnt++;
        }
        C[i] = comcnt;
    }
    return C;
}

int main(){
    int n;
    cout << "Enter No of Elements in Arrays A & B, n = ";
    cin >> n;
    vector<int> A(n);
    vector<int> B(n);
    cout << "Enter the elements of Array A = ";
    for (int i = 0; i < n; i ++){
        cin >> A[i];
    }
    cout << "Enter the elements of Array B = ";
    for (int i = 0; i < n; i ++){
        cin >> B[i];
    }
    vector<int> C(n);
    C = findThePrefixCommonArray(A, B);
    cout << "[";
    for (int i = 0; i < n; i ++){
        cout << C[i];
        if (i != n - 1)     cout << ", ";
    }
    cout << "]" << endl;
    return 0;
}
