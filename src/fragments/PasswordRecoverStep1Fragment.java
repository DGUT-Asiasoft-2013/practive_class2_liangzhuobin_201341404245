package fragments;




import com.example.hello.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import inputcells.SimpleTextInputCellFragment;

public class PasswordRecoverStep1Fragment extends Fragment{
	SimpleTextInputCellFragment fragEmail;
	View view;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		if(view==null){
			view = inflater.inflate(R.layout.fragment_password_recover_step1, null);
			
			fragEmail = (SimpleTextInputCellFragment) getFragmentManager().findFragmentById(R.id.input_email);
			
			view.findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					goNext();
				}
			});	
		}
		
		return view;
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
		fragEmail.setLabelText("ע������");
		fragEmail.setHintText("����ע�������ַ");
	}
	
	public static interface OnGoNextListener{
		void onGoNext();
	}
	
	OnGoNextListener onGoNextListener;
	
	public void setOnGoNextListener(OnGoNextListener onGoNextListener) {
		this.onGoNextListener = onGoNextListener;
	}
	
	void goNext(){
		if(onGoNextListener!=null){
			onGoNextListener.onGoNext();
		}
	}
}
