package pages;

import com.example.hello.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SearchFragment extends Fragment {
	View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		if(view==null){
			view= inflater.inflate(R.layout.fragment_page_search, null);
		}
		
		return view;
	}
}
