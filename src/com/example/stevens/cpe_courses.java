package com.example.stevens;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

public class cpe_courses extends Fragment implements OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        System.out.println("ConputerFragment--->onCreateView");
        View v=inflater.inflate(R.layout.cpe_courses, container, false);

		Button cpe514 = (Button)v.findViewById(R.id.cpe514);
		Button cpe517 = (Button)v.findViewById(R.id.cpe517);
		Button cpe521 = (Button)v.findViewById(R.id.cpe521);
		Button cpe533 = (Button)v.findViewById(R.id.cpe533);
		Button cpe536 = (Button)v.findViewById(R.id.cpe536);
		Button cpe537 = (Button)v.findViewById(R.id.cpe537);
		Button cpe540 = (Button)v.findViewById(R.id.cpe540);
		Button cpe542 = (Button)v.findViewById(R.id.cpe542);
		Button cpe545 = (Button)v.findViewById(R.id.cpe545);
		Button cpe548 = (Button)v.findViewById(R.id.cpe548);
		Button cpe550 = (Button)v.findViewById(R.id.cpe550);
		Button cpe555 = (Button)v.findViewById(R.id.cpe555);
		Button cpe556 = (Button)v.findViewById(R.id.cpe556);
		Button cpe558 = (Button)v.findViewById(R.id.cpe558);
		Button cpe560 = (Button)v.findViewById(R.id.cpe560);
		Button cpe563 = (Button)v.findViewById(R.id.cpe563);
		Button cpe565 = (Button)v.findViewById(R.id.cpe565);
		Button cpe579 = (Button)v.findViewById(R.id.cpe579);
		Button cpe580 = (Button)v.findViewById(R.id.cpe580);
		Button cpe585 = (Button)v.findViewById(R.id.cpe585);
		Button cpe590 = (Button)v.findViewById(R.id.cpe590);
		Button cpe591 = (Button)v.findViewById(R.id.cpe591);
		Button cpe592 = (Button)v.findViewById(R.id.cpe592);
		Button cpe593 = (Button)v.findViewById(R.id.cpe593);
		Button cpe599 = (Button)v.findViewById(R.id.cpe599);
		Button cpe600 = (Button)v.findViewById(R.id.cpe600);
		Button cpe602 = (Button)v.findViewById(R.id.cpe602);
		Button cpe604 = (Button)v.findViewById(R.id.cpe604);
		Button cpe608 = (Button)v.findViewById(R.id.cpe608);
		Button cpe610 = (Button)v.findViewById(R.id.cpe610);
		Button cpe612 = (Button)v.findViewById(R.id.cpe612);
		Button cpe619 = (Button)v.findViewById(R.id.cpe619);
		Button cpe625 = (Button)v.findViewById(R.id.cpe625);
		Button cpe631 = (Button)v.findViewById(R.id.cpe631);
		Button cpe636 = (Button)v.findViewById(R.id.cpe636);
		Button cpe638 = (Button)v.findViewById(R.id.cpe638);
		Button cpe640 = (Button)v.findViewById(R.id.cpe640);
		Button cpe642 = (Button)v.findViewById(R.id.cpe642);
		Button cpe643 = (Button)v.findViewById(R.id.cpe643);
		Button cpe644 = (Button)v.findViewById(R.id.cpe644);
		Button cpe645 = (Button)v.findViewById(R.id.cpe645);
		Button cpe646 = (Button)v.findViewById(R.id.cpe646);
		Button cpe654 = (Button)v.findViewById(R.id.cpe654);
		Button cpe655 = (Button)v.findViewById(R.id.cpe655);
		Button cpe656 = (Button)v.findViewById(R.id.cpe656);
		Button cpe658 = (Button)v.findViewById(R.id.cpe658);
		Button cpe664 = (Button)v.findViewById(R.id.cpe664);
		Button cpe668 = (Button)v.findViewById(R.id.cpe668);
		Button cpe671 = (Button)v.findViewById(R.id.cpe671);
		Button cpe678 = (Button)v.findViewById(R.id.cpe678);
		Button cpe679 = (Button)v.findViewById(R.id.cpe679);
		Button cpe680 = (Button)v.findViewById(R.id.cpe680);
		Button cpe682 = (Button)v.findViewById(R.id.cpe682);
		Button cpe685 = (Button)v.findViewById(R.id.cpe685);
		Button cpe686 = (Button)v.findViewById(R.id.cpe686);
		Button cpe690 = (Button)v.findViewById(R.id.cpe690);
		Button cpe691 = (Button)v.findViewById(R.id.cpe691);
		Button cpe693 = (Button)v.findViewById(R.id.cpe693);
		Button cpe695 = (Button)v.findViewById(R.id.cpe695);
		Button cpe700 = (Button)v.findViewById(R.id.cpe700);
		Button cpe701 = (Button)v.findViewById(R.id.cpe701);
		Button cpe702 = (Button)v.findViewById(R.id.cpe702);
		Button cpe732 = (Button)v.findViewById(R.id.cpe732);
		Button cpe765 = (Button)v.findViewById(R.id.cpe765);
		Button cpe800 = (Button)v.findViewById(R.id.cpe800);
		Button cpe801 = (Button)v.findViewById(R.id.cpe801);
		Button cpe810 = (Button)v.findViewById(R.id.cpe810);
		Button cpe900 = (Button)v.findViewById(R.id.cpe900);
		Button cpe950 = (Button)v.findViewById(R.id.cpe950);
		Button cpe960 = (Button)v.findViewById(R.id.cpe960);
		
		cpe514.setOnClickListener(this);
		cpe517.setOnClickListener(this);
		cpe521.setOnClickListener(this);
		cpe533.setOnClickListener(this);
		cpe536.setOnClickListener(this);
		cpe537.setOnClickListener(this);
		cpe540.setOnClickListener(this);
		cpe542.setOnClickListener(this);
		cpe545.setOnClickListener(this);
		cpe548.setOnClickListener(this);
		cpe550.setOnClickListener(this);
		cpe555.setOnClickListener(this);
		cpe556.setOnClickListener(this);
		cpe558.setOnClickListener(this);
		cpe560.setOnClickListener(this);
		cpe563.setOnClickListener(this);
		cpe565.setOnClickListener(this);
		cpe579.setOnClickListener(this);
		cpe580.setOnClickListener(this);
		cpe585.setOnClickListener(this);
		cpe590.setOnClickListener(this);
		cpe591.setOnClickListener(this);
		cpe592.setOnClickListener(this);
		cpe593.setOnClickListener(this);
		cpe599.setOnClickListener(this);
		cpe600.setOnClickListener(this);
		cpe602.setOnClickListener(this);
		cpe604.setOnClickListener(this);
		cpe608.setOnClickListener(this);
		cpe610.setOnClickListener(this);
		cpe612.setOnClickListener(this);
		cpe619.setOnClickListener(this);
		cpe625.setOnClickListener(this);
		cpe631.setOnClickListener(this);
		cpe636.setOnClickListener(this);
		cpe638.setOnClickListener(this);
		cpe640.setOnClickListener(this);
		cpe642.setOnClickListener(this);
		cpe643.setOnClickListener(this);
		cpe644.setOnClickListener(this);
		cpe645.setOnClickListener(this);
		cpe646.setOnClickListener(this);
		cpe654.setOnClickListener(this);
		cpe655.setOnClickListener(this);
		cpe656.setOnClickListener(this);
		cpe658.setOnClickListener(this);
		cpe664.setOnClickListener(this);
		cpe668.setOnClickListener(this);
		cpe671.setOnClickListener(this);
		cpe678.setOnClickListener(this);
		cpe679.setOnClickListener(this);
		cpe680.setOnClickListener(this);
		cpe682.setOnClickListener(this);
		cpe685.setOnClickListener(this);
		cpe686.setOnClickListener(this);
		cpe690.setOnClickListener(this);
		cpe691.setOnClickListener(this);
		cpe693.setOnClickListener(this);
		cpe695.setOnClickListener(this);
		cpe700.setOnClickListener(this);
		cpe701.setOnClickListener(this);
		cpe702.setOnClickListener(this);
		cpe732.setOnClickListener(this);
		cpe765.setOnClickListener(this);
		cpe800.setOnClickListener(this);
		cpe801.setOnClickListener(this);
		cpe810.setOnClickListener(this);
		cpe900.setOnClickListener(this);
		cpe950.setOnClickListener(this);
		cpe960.setOnClickListener(this);
		
		return v;
    }

    @Override
    public void onStop()
    {
        System.out.println("ConputerFragment--->onStop");
        super.onStop();
    }
	
	
	
	
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(getActivity().getApplicationContext(), rate.class);
		
		switch(v.getId()) {
		case R.id.cpe514:
			i.putExtra("course", "cpe514");
			startActivity(i);
			break;
			
		case R.id.cpe517:
			i.putExtra("course", "cpe517");
			startActivity(i);
			break;
			
		case R.id.cpe521:
			i.putExtra("course", "cpe521");
			startActivity(i);
			break;
			
		case R.id.cpe533:
			i.putExtra("course", "cpe533");
			startActivity(i);
			break;
			
		case R.id.cpe536:
			i.putExtra("course", "cpe536");
			startActivity(i);
			break;
			
		case R.id.cpe537:
			i.putExtra("course", "cpe537");
			startActivity(i);
			break;
			
		case R.id.cpe540:
			i.putExtra("course", "cpe540");
			startActivity(i);
			break;
			
		case R.id.cpe542:
			i.putExtra("course", "cpe542");
			startActivity(i);
			break;
			
		case R.id.cpe545:
			i.putExtra("course", "cpe545");
			startActivity(i);
			break;
			
		case R.id.cpe548:
			i.putExtra("course", "cpe548");
			startActivity(i);
			break;
			
		case R.id.cpe550:
			i.putExtra("course", "cpe550");
			startActivity(i);
			break;
			
		case R.id.cpe555:
			i.putExtra("course", "cpe555");
			startActivity(i);
			break;
			
		case R.id.cpe556:
			i.putExtra("course", "cpe556");
			startActivity(i);
			break;
			
		case R.id.cpe558:
			i.putExtra("course", "cpe558");
			startActivity(i);
			break;
			
		case R.id.cpe560:
			i.putExtra("course", "cpe560");
			startActivity(i);
			break;
			
		case R.id.cpe563:
			i.putExtra("course", "cpe563");
			startActivity(i);
			break;
			
		case R.id.cpe565:
			i.putExtra("course", "cpe565");
			startActivity(i);
			break;
			
		case R.id.cpe579:
			i.putExtra("course", "cpe579");
			startActivity(i);
			break;
			
		case R.id.cpe580:
			i.putExtra("course", "cpe580");
			startActivity(i);
			break;
			
		case R.id.cpe585:
			i.putExtra("course", "cpe585");
			startActivity(i);
			break;
			
		case R.id.cpe590:
			i.putExtra("course", "cpe590");
			startActivity(i);
			break;
			
		case R.id.cpe591:
			i.putExtra("course", "cpe591");
			startActivity(i);
			break;
			
		case R.id.cpe592:
			i.putExtra("course", "cpe592");
			startActivity(i);
			break;
			
		case R.id.cpe593:
			i.putExtra("course", "cpe593");
			startActivity(i);
			break;
			
		case R.id.cpe599:
			i.putExtra("course", "cpe599");
			startActivity(i);
			break;
			
		case R.id.cpe600:
			i.putExtra("course", "cpe600");
			startActivity(i);
			break;
			
		case R.id.cpe602:
			i.putExtra("course", "cpe602");
			startActivity(i);
			break;
			
		case R.id.cpe604:
			i.putExtra("course", "cpe604");
			startActivity(i);
			break;
			
		case R.id.cpe608:
			i.putExtra("course", "cpe608");
			startActivity(i);
			break;
			
		case R.id.cpe610:
			i.putExtra("course", "cpe610");
			startActivity(i);
			break;
			
		case R.id.cpe612:
			i.putExtra("course", "cpe612");
			startActivity(i);
			break;
			
		case R.id.cpe619:
			i.putExtra("course", "cpe619");
			startActivity(i);
			break;
			
		case R.id.cpe625:
			i.putExtra("course", "cpe625");
			startActivity(i);
			break;
			
		case R.id.cpe631:
			i.putExtra("course", "cpe631");
			startActivity(i);
			break;
			
		case R.id.cpe636:
			i.putExtra("course", "cpe636");
			startActivity(i);
			break;
			
		case R.id.cpe638:
			i.putExtra("course", "cpe638");
			startActivity(i);
			break;
			
		case R.id.cpe640:
			i.putExtra("course", "cpe640");
			startActivity(i);
			break;
			
		case R.id.cpe642:
			i.putExtra("course", "cpe642");
			startActivity(i);
			break;
			
		case R.id.cpe643:
			i.putExtra("course", "cpe643");
			startActivity(i);
			break;
			
		case R.id.cpe644:
			i.putExtra("course", "cpe644");
			startActivity(i);
			break;
			
		case R.id.cpe645:
			i.putExtra("course", "cpe645");
			startActivity(i);
			break;
			
		case R.id.cpe646:
			i.putExtra("course", "cpe646");
			startActivity(i);
			break;
			
		case R.id.cpe654:
			i.putExtra("course", "cpe654");
			startActivity(i);
			break;
			
		case R.id.cpe655:
			i.putExtra("course", "cpe655");
			startActivity(i);
			break;
			
		case R.id.cpe656:
			i.putExtra("course", "cpe656");
			startActivity(i);
			break;
			
		case R.id.cpe658:
			i.putExtra("course", "cpe658");
			startActivity(i);
			break;
			
		case R.id.cpe664:
			i.putExtra("course", "cpe664");
			startActivity(i);
			break;
			
		case R.id.cpe668:
			i.putExtra("course", "cpe668");
			startActivity(i);
			break;
			
		case R.id.cpe671:
			i.putExtra("course", "cpe671");
			startActivity(i);
			break;
			
		case R.id.cpe678:
			i.putExtra("course", "cpe678");
			startActivity(i);
			break;
			
		case R.id.cpe679:
			i.putExtra("course", "cpe679");
			startActivity(i);
			break;
			
		case R.id.cpe680:
			i.putExtra("course", "cpe680");
			startActivity(i);
			break;
			
		case R.id.cpe682:
			i.putExtra("course", "cpe682");
			startActivity(i);
			break;
			
		case R.id.cpe685:
			i.putExtra("course", "cpe685");
			startActivity(i);
			break;
			
		case R.id.cpe686:
			i.putExtra("course", "cpe686");
			startActivity(i);
			break;
			
		case R.id.cpe690:
			i.putExtra("course", "cpe690");
			startActivity(i);
			break;
			
		case R.id.cpe691:
			i.putExtra("course", "cpe691");
			startActivity(i);
			break;
			
		case R.id.cpe693:
			i.putExtra("course", "cpe693");
			startActivity(i);
			break;
			
		case R.id.cpe695:
			i.putExtra("course", "cpe695");
			startActivity(i);
			break;
			
		case R.id.cpe700:
			i.putExtra("course", "cpe700");
			startActivity(i);
			break;
			
		case R.id.cpe701:
			i.putExtra("course", "cpe701");
			startActivity(i);
			break;
			
		case R.id.cpe702:
			i.putExtra("course", "cpe702");
			startActivity(i);
			break;
			
		case R.id.cpe732:
			i.putExtra("course", "cpe732");
			startActivity(i);
			break;
			
		case R.id.cpe765:
			i.putExtra("course", "cpe765");
			startActivity(i);
			break;
			
		case R.id.cpe800:
			i.putExtra("course", "cpe800");
			startActivity(i);
			break;
			
		case R.id.cpe801:
			i.putExtra("course", "cpe801");
			startActivity(i);
			break;
			
		case R.id.cpe810:
			i.putExtra("course", "cpe810");
			startActivity(i);
			break;
			
		case R.id.cpe900:
			i.putExtra("course", "cpe900");
			startActivity(i);
			break;
			
		case R.id.cpe950:
			i.putExtra("course", "cpe950");
			startActivity(i);
			break;
			
		case R.id.cpe960:
			i.putExtra("course", "cpe960");
			startActivity(i);
			break;
		}
	}

}
