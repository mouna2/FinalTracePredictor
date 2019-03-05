package ALGO;

import mypackage.*;

public class PredictionValues {
		public int T=0; 
		public int N=0; 
		public int E=0;
		public int getT() {
			return T;
		}
		public void setT(int t) {
			T = t;
		}
		public int getN() {
			return N;
		}
		public void setN(int n) {
			N = n;
		}
		public int getE() {
			return E;
		}
		public void setE(int e) {
			E = e;
		}
		@Override
		public String toString() {
			return "PredictionValues [T=" + T + ", N=" + N + ", E=" + E + "]";
		}
		public void ComputePredictionValues(PredictionValues remainingpredictionValues, String  prediction) {
			
			// TODO Auto-generated method stub
			if(prediction.trim().equals("T")) {
				remainingpredictionValues.T++; 
			}else if(prediction.trim().equals("N")) {
				remainingpredictionValues.N++; 
			}else {
				remainingpredictionValues.E++; 

			}
		}
		public PredictionValues(int t, int n, int e) {
			super();
			T = t;
			N = n;
			E = e;
		} 
		
		public PredictionValues() {} 
		
		
}
