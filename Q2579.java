import java.io.*;

public class Q2579 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[301];
		int[] d = new int[301];
		for(int i=1;i<=n;i++){
			arr[i]= Integer.parseInt(br.readLine());
		}

		d[1] = arr[1];
		if(n>=2){
			d[2] = Math.max(d[1]+arr[2],arr[2]);
		}

		for(int i=3;i<=n;i++){
			d[i] = Math.max(d[i-2]+arr[i],d[i-3]+arr[i-1]+arr[i]);
		}
		bw.write(Integer.toString(d[n]));
		bw.flush();
		bw.close();
	}
}
