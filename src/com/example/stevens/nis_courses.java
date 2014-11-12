package com.example.stevens;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class nis_courses extends Fragment implements OnClickListener {
    @Override
    public void onStop()
    {
        System.out.println("ConputerFragment--->onStop");
        super.onStop();
    }
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        System.out.println("ConputerFragment--->onCreateView");
        View v=inflater.inflate(R.layout.nis_courses, container, false);
        
        Button nis505 = (Button)v.findViewById(R.id.nis505);
		Button nis514 = (Button)v.findViewById(R.id.nis514);
		Button nis521 = (Button)v.findViewById(R.id.nis521);
		Button nis536 = (Button)v.findViewById(R.id.nis536);
		Button nis545 = (Button)v.findViewById(R.id.nis545);
		Button nis560 = (Button)v.findViewById(R.id.nis560);
		Button nis561 = (Button)v.findViewById(R.id.nis561);
		Button nis563 = (Button)v.findViewById(R.id.nis563);
		Button nis564 = (Button)v.findViewById(R.id.nis564);
		Button nis565 = (Button)v.findViewById(R.id.nis565);
		Button nis583 = (Button)v.findViewById(R.id.nis583);
		Button nis584 = (Button)v.findViewById(R.id.nis584);
		Button nis586 = (Button)v.findViewById(R.id.nis586);
		Button nis591 = (Button)v.findViewById(R.id.nis591);
		Button nis592 = (Button)v.findViewById(R.id.nis592);
		Button nis593 = (Button)v.findViewById(R.id.nis593);
		Button nis599 = (Button)v.findViewById(R.id.nis599);
		Button nis602 = (Button)v.findViewById(R.id.nis602);
		Button nis604 = (Button)v.findViewById(R.id.nis604);
		Button nis605 = (Button)v.findViewById(R.id.nis605);
		Button nis608 = (Button)v.findViewById(R.id.nis608);
		Button nis609 = (Button)v.findViewById(R.id.nis609);
		Button nis610 = (Button)v.findViewById(R.id.nis610);
		Button nis611 = (Button)v.findViewById(R.id.nis611);
		Button nis612 = (Button)v.findViewById(R.id.nis612);
		Button nis619 = (Button)v.findViewById(R.id.nis619);
		Button nis626 = (Button)v.findViewById(R.id.nis626);
		Button nis630 = (Button)v.findViewById(R.id.nis630);
		Button nis631 = (Button)v.findViewById(R.id.nis631);
		Button nis632 = (Button)v.findViewById(R.id.nis632);
		Button nis633 = (Button)v.findViewById(R.id.nis633);
		Button nis645 = (Button)v.findViewById(R.id.nis645);
		Button nis651 = (Button)v.findViewById(R.id.nis651);
		Button nis653 = (Button)v.findViewById(R.id.nis653);
		Button nis654 = (Button)v.findViewById(R.id.nis654);
		Button nis655 = (Button)v.findViewById(R.id.nis655);
		Button nis656 = (Button)v.findViewById(R.id.nis656);
		Button nis672 = (Button)v.findViewById(R.id.nis672);
		Button nis674 = (Button)v.findViewById(R.id.nis674);
		Button nis678 = (Button)v.findViewById(R.id.nis678);
		Button nis679 = (Button)v.findViewById(R.id.nis679);
		Button nis691 = (Button)v.findViewById(R.id.nis691);
		Button nis700 = (Button)v.findViewById(R.id.nis700);
		Button nis765 = (Button)v.findViewById(R.id.nis765);
		Button nis770 = (Button)v.findViewById(R.id.nis770);
		Button nis800 = (Button)v.findViewById(R.id.nis800);
		Button nis810 = (Button)v.findViewById(R.id.nis810);
		Button nis900 = (Button)v.findViewById(R.id.nis900);
		
		nis505.setOnClickListener(this);
		nis514.setOnClickListener(this);
		nis521.setOnClickListener(this);
		nis536.setOnClickListener(this);
		nis545.setOnClickListener(this);
		nis560.setOnClickListener(this);
		nis561.setOnClickListener(this);
		nis563.setOnClickListener(this);
		nis564.setOnClickListener(this);
		nis565.setOnClickListener(this);
		nis583.setOnClickListener(this);
		nis584.setOnClickListener(this);
		nis586.setOnClickListener(this);
		nis591.setOnClickListener(this);
		nis592.setOnClickListener(this);
		nis593.setOnClickListener(this);
		nis599.setOnClickListener(this);
		nis602.setOnClickListener(this);
		nis604.setOnClickListener(this);
		nis605.setOnClickListener(this);
		nis608.setOnClickListener(this);
		nis609.setOnClickListener(this);
		nis610.setOnClickListener(this);
		nis611.setOnClickListener(this);
		nis612.setOnClickListener(this);
		nis619.setOnClickListener(this);
		nis626.setOnClickListener(this);
		nis630.setOnClickListener(this);
		nis631.setOnClickListener(this);
		nis632.setOnClickListener(this);
		nis633.setOnClickListener(this);
		nis645.setOnClickListener(this);
		nis651.setOnClickListener(this);
		nis653.setOnClickListener(this);
		nis654.setOnClickListener(this);
		nis655.setOnClickListener(this);
		nis656.setOnClickListener(this);
		nis672.setOnClickListener(this);
		nis674.setOnClickListener(this);
		nis678.setOnClickListener(this);
		nis679.setOnClickListener(this);
		nis691.setOnClickListener(this);
		nis700.setOnClickListener(this);
		nis765.setOnClickListener(this);
		nis770.setOnClickListener(this);
		nis800.setOnClickListener(this);
		nis810.setOnClickListener(this);
		nis900.setOnClickListener(this);
		
		return v;
    }
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(getActivity().getApplicationContext(), rate.class);
		
		switch(v.getId()) {
		case R.id.nis505:
			i.putExtra("course", "nis505");
			startActivity(i);
			break;
			
		case R.id.nis514:
			i.putExtra("course", "nis514");
			startActivity(i);
			break;
			
		case R.id.nis521:
			i.putExtra("course", "nis521");
			startActivity(i);
			break;
			
		case R.id.nis536:
			i.putExtra("course", "nis536");
			startActivity(i);
			break;
			
		case R.id.nis545:
			i.putExtra("course", "nis545");
			startActivity(i);
			break;
			
		case R.id.nis560:
			i.putExtra("course", "nis560");
			startActivity(i);
			break;
			
		case R.id.nis561:
			i.putExtra("course", "nis561");
			startActivity(i);
			break;
			
		case R.id.nis563:
			i.putExtra("course", "nis563");
			startActivity(i);
			break;
			
		case R.id.nis564:
			i.putExtra("course", "nis564");
			startActivity(i);
			break;
			
		case R.id.nis565:
			i.putExtra("course", "nis565");
			startActivity(i);
			break;
			
		case R.id.nis583:
			i.putExtra("course", "nis583");
			startActivity(i);
			break;
			
		case R.id.nis584:
			i.putExtra("course", "nis584");
			startActivity(i);
			break;
			
		case R.id.nis586:
			i.putExtra("course", "nis586");
			startActivity(i);
			break;
			
		case R.id.nis591:
			i.putExtra("course", "nis591");
			startActivity(i);
			break;
			
		case R.id.nis592:
			i.putExtra("course", "nis592");
			startActivity(i);
			break;
			
		case R.id.nis593:
			i.putExtra("course", "nis593");
			startActivity(i);
			break;
			
		case R.id.nis599:
			i.putExtra("course", "nis599");
			startActivity(i);
			break;
			
		case R.id.nis602:
			i.putExtra("course", "nis602");
			startActivity(i);
			break;
			
		case R.id.nis604:
			i.putExtra("course", "nis604");
			startActivity(i);
			break;
			
		case R.id.nis605:
			i.putExtra("course", "nis605");
			startActivity(i);
			break;
			
		case R.id.nis608:
			i.putExtra("course", "nis608");
			startActivity(i);
			break;
			
		case R.id.nis609:
			i.putExtra("course", "nis609");
			startActivity(i);
			break;
			
		case R.id.nis610:
			i.putExtra("course", "nis610");
			startActivity(i);
			break;
			
		case R.id.nis611:
			i.putExtra("course", "nis611");
			startActivity(i);
			break;
			
		case R.id.nis612:
			i.putExtra("course", "nis612");
			startActivity(i);
			break;
			
		case R.id.nis619:
			i.putExtra("course", "nis619");
			startActivity(i);
			break;
			
		case R.id.nis626:
			i.putExtra("course", "nis626");
			startActivity(i);
			break;
			
		case R.id.nis630:
			i.putExtra("course", "nis630");
			startActivity(i);
			break;
			
		case R.id.nis631:
			i.putExtra("course", "nis631");
			startActivity(i);
			break;
			
		case R.id.nis632:
			i.putExtra("course", "nis632");
			startActivity(i);
			break;
			
		case R.id.nis633:
			i.putExtra("course", "nis633");
			startActivity(i);
			break;
			
		case R.id.nis645:
			i.putExtra("course", "nis645");
			startActivity(i);
			break;
			
		case R.id.nis651:
			i.putExtra("course", "nis651");
			startActivity(i);
			break;
			
		case R.id.nis653:
			i.putExtra("course", "nis653");
			startActivity(i);
			break;
			
		case R.id.nis654:
			i.putExtra("course", "nis654");
			startActivity(i);
			break;
			
		case R.id.nis655:
			i.putExtra("course", "nis655");
			startActivity(i);
			break;
			
		case R.id.nis656:
			i.putExtra("course", "nis656");
			startActivity(i);
			break;
			
		case R.id.nis672:
			i.putExtra("course", "nis672");
			startActivity(i);
			break;
			
		case R.id.nis674:
			i.putExtra("course", "nis674");
			startActivity(i);
			break;
			
		case R.id.nis678:
			i.putExtra("course", "nis678");
			startActivity(i);
			break;
			
		case R.id.nis679:
			i.putExtra("course", "nis679");
			startActivity(i);
			break;
			
		case R.id.nis691:
			i.putExtra("course", "nis691");
			startActivity(i);
			break;
			
		case R.id.nis700:
			i.putExtra("course", "nis700");
			startActivity(i);
			break;
			
		case R.id.nis765:
			i.putExtra("course", "nis765");
			startActivity(i);
			break;
			
		case R.id.nis770:
			i.putExtra("course", "nis770");
			startActivity(i);
			break;
			
		case R.id.nis800:
			i.putExtra("course", "nis800");
			startActivity(i);
			break;
			
		case R.id.nis810:
			i.putExtra("course", "nis810");
			startActivity(i);
			break;
			
		case R.id.nis900:
			i.putExtra("course", "nis900");
			startActivity(i);
			break;
		}
	}

}
