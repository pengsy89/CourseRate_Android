package com.example.stevens;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

public class ee_courses extends Fragment implements OnClickListener {


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
		View v=inflater.inflate(R.layout.ee_courses, container, false);
		Button ee503 = (Button)v.findViewById(R.id.ee503);
		Button ee507 = (Button)v.findViewById(R.id.ee507);
		Button ee509 = (Button)v.findViewById(R.id.ee509);
		Button ee510 = (Button)v.findViewById(R.id.ee510);
		Button ee515 = (Button)v.findViewById(R.id.ee515);
		Button ee516 = (Button)v.findViewById(R.id.ee516);
		Button ee517 = (Button)v.findViewById(R.id.ee517);
		Button ee541 = (Button)v.findViewById(R.id.ee541);
		Button ee542 = (Button)v.findViewById(R.id.ee542);
		Button ee548 = (Button)v.findViewById(R.id.ee548);
		Button ee556 = (Button)v.findViewById(R.id.ee556);
		Button ee560 = (Button)v.findViewById(R.id.ee560);
		Button ee561 = (Button)v.findViewById(R.id.ee561);
		Button ee562 = (Button)v.findViewById(R.id.ee562);
		Button ee568 = (Button)v.findViewById(R.id.ee568);
		Button ee575 = (Button)v.findViewById(R.id.ee575);
		Button ee583 = (Button)v.findViewById(R.id.ee583);
		Button ee584 = (Button)v.findViewById(R.id.ee584);
		Button ee585 = (Button)v.findViewById(R.id.ee585);
		Button ee586 = (Button)v.findViewById(R.id.ee586);
		Button ee587 = (Button)v.findViewById(R.id.ee587);
		Button ee588 = (Button)v.findViewById(R.id.ee588);
		Button ee589 = (Button)v.findViewById(R.id.ee589);
		Button ee590 = (Button)v.findViewById(R.id.ee590);
		Button ee595 = (Button)v.findViewById(R.id.ee595);
		Button ee596 = (Button)v.findViewById(R.id.ee596);
		Button ee599 = (Button)v.findViewById(R.id.ee599);
		Button ee602 = (Button)v.findViewById(R.id.ee602);
		Button ee603 = (Button)v.findViewById(R.id.ee603);
		Button ee605 = (Button)v.findViewById(R.id.ee605);
		Button ee606 = (Button)v.findViewById(R.id.ee606);
		Button ee608 = (Button)v.findViewById(R.id.ee608);
		Button ee609 = (Button)v.findViewById(R.id.ee609);
		Button ee610 = (Button)v.findViewById(R.id.ee610);
		Button ee611 = (Button)v.findViewById(R.id.ee611);
		Button ee612 = (Button)v.findViewById(R.id.ee612);
		Button ee613 = (Button)v.findViewById(R.id.ee613);
		Button ee615 = (Button)v.findViewById(R.id.ee615);
		Button ee616 = (Button)v.findViewById(R.id.ee616);
		Button ee617 = (Button)v.findViewById(R.id.ee617);
		Button ee619 = (Button)v.findViewById(R.id.ee619);
		Button ee620 = (Button)v.findViewById(R.id.ee620);
		Button ee621 = (Button)v.findViewById(R.id.ee621);
		Button ee626 = (Button)v.findViewById(R.id.ee626);
		Button ee627 = (Button)v.findViewById(R.id.ee627);
		Button ee628 = (Button)v.findViewById(R.id.ee628);
		Button ee631 = (Button)v.findViewById(R.id.ee631);
		Button ee647 = (Button)v.findViewById(R.id.ee647);
		Button ee651 = (Button)v.findViewById(R.id.ee651);
		Button ee653 = (Button)v.findViewById(R.id.ee653);
		Button ee663 = (Button)v.findViewById(R.id.ee663);
		Button ee664 = (Button)v.findViewById(R.id.ee664);
		Button ee666 = (Button)v.findViewById(R.id.ee666);
		Button ee670 = (Button)v.findViewById(R.id.ee670);
		Button ee672 = (Button)v.findViewById(R.id.ee672);
		Button ee673 = (Button)v.findViewById(R.id.ee673);
		Button ee674 = (Button)v.findViewById(R.id.ee674);
		Button ee681 = (Button)v.findViewById(R.id.ee681);
		Button ee683 = (Button)v.findViewById(R.id.ee683);
		Button ee684 = (Button)v.findViewById(R.id.ee684);
		Button ee685 = (Button)v.findViewById(R.id.ee685);
		Button ee686 = (Button)v.findViewById(R.id.ee686);
		Button ee690 = (Button)v.findViewById(R.id.ee690);
		Button ee693 = (Button)v.findViewById(R.id.ee693);
		Button ee695 = (Button)v.findViewById(R.id.ee695);
		Button ee700 = (Button)v.findViewById(R.id.ee700);
		Button ee701 = (Button)v.findViewById(R.id.ee701);
		Button ee710 = (Button)v.findViewById(R.id.ee710);
		Button ee740 = (Button)v.findViewById(R.id.ee740);
		Button ee775 = (Button)v.findViewById(R.id.ee775);
		Button ee787 = (Button)v.findViewById(R.id.ee787);
		Button ee800 = (Button)v.findViewById(R.id.ee800);
		Button ee801 = (Button)v.findViewById(R.id.ee801);
		Button ee810 = (Button)v.findViewById(R.id.ee810);
		Button ee900 = (Button)v.findViewById(R.id.ee900);
		Button ee950 = (Button)v.findViewById(R.id.ee950);
		Button ee960 = (Button)v.findViewById(R.id.ee960);

		ee503.setOnClickListener(this);
		ee507.setOnClickListener(this);
		ee509.setOnClickListener(this);
		ee510.setOnClickListener(this);
		ee515.setOnClickListener(this);
		ee516.setOnClickListener(this);
		ee517.setOnClickListener(this);
		ee541.setOnClickListener(this);
		ee542.setOnClickListener(this);
		ee548.setOnClickListener(this);
		ee556.setOnClickListener(this);
		ee560.setOnClickListener(this);
		ee561.setOnClickListener(this);
		ee562.setOnClickListener(this);
		ee568.setOnClickListener(this);
		ee575.setOnClickListener(this);
		ee583.setOnClickListener(this);
		ee584.setOnClickListener(this);
		ee585.setOnClickListener(this);
		ee586.setOnClickListener(this);
		ee587.setOnClickListener(this);
		ee588.setOnClickListener(this);
		ee589.setOnClickListener(this);
		ee590.setOnClickListener(this);
		ee595.setOnClickListener(this);
		ee596.setOnClickListener(this);
		ee599.setOnClickListener(this);
		ee602.setOnClickListener(this);
		ee603.setOnClickListener(this);
		ee605.setOnClickListener(this);
		ee606.setOnClickListener(this);
		ee608.setOnClickListener(this);
		ee609.setOnClickListener(this);
		ee610.setOnClickListener(this);
		ee611.setOnClickListener(this);
		ee612.setOnClickListener(this);
		ee613.setOnClickListener(this);
		ee615.setOnClickListener(this);
		ee616.setOnClickListener(this);
		ee617.setOnClickListener(this);
		ee619.setOnClickListener(this);
		ee620.setOnClickListener(this);
		ee621.setOnClickListener(this);
		ee626.setOnClickListener(this);
		ee627.setOnClickListener(this);
		ee628.setOnClickListener(this);
		ee631.setOnClickListener(this);
		ee647.setOnClickListener(this);
		ee651.setOnClickListener(this);
		ee653.setOnClickListener(this);
		ee663.setOnClickListener(this);
		ee664.setOnClickListener(this);
		ee666.setOnClickListener(this);
		ee670.setOnClickListener(this);
		ee672.setOnClickListener(this);
		ee673.setOnClickListener(this);
		ee674.setOnClickListener(this);
		ee681.setOnClickListener(this);
		ee683.setOnClickListener(this);
		ee684.setOnClickListener(this);
		ee685.setOnClickListener(this);
		ee686.setOnClickListener(this);
		ee690.setOnClickListener(this);
		ee693.setOnClickListener(this);
		ee695.setOnClickListener(this);
		ee700.setOnClickListener(this);
		ee701.setOnClickListener(this);
		ee710.setOnClickListener(this);
		ee740.setOnClickListener(this);
		ee775.setOnClickListener(this);
		ee787.setOnClickListener(this);
		ee800.setOnClickListener(this);
		ee801.setOnClickListener(this);
		ee810.setOnClickListener(this);
		ee900.setOnClickListener(this);
		ee950.setOnClickListener(this);
		ee960.setOnClickListener(this);
		return v;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(this.getActivity().getApplicationContext(), rate.class);

		switch(v.getId()) {
		case R.id.ee503:
			i.putExtra("course", "ee503");
			startActivity(i);
			break;

		case R.id.ee507:
			i.putExtra("course", "ee507");
			startActivity(i);
			break;

		case R.id.ee509:
			i.putExtra("course", "ee509");
			startActivity(i);
			break;

		case R.id.ee510:
			i.putExtra("course", "ee510");
			startActivity(i);
			break;

		case R.id.ee515:
			i.putExtra("course", "ee515");
			startActivity(i);
			break;

		case R.id.ee516:
			i.putExtra("course", "ee516");
			startActivity(i);
			break;

		case R.id.ee517:
			i.putExtra("course", "ee517");
			startActivity(i);
			break;

		case R.id.ee541:
			i.putExtra("course", "ee541");
			startActivity(i);
			break;

		case R.id.ee542:
			i.putExtra("course", "ee542");
			startActivity(i);
			break;

		case R.id.ee548:
			i.putExtra("course", "ee548");
			startActivity(i);
			break;

		case R.id.ee556:
			i.putExtra("course", "ee556");
			startActivity(i);
			break;

		case R.id.ee560:
			i.putExtra("course", "ee560");
			startActivity(i);
			break;

		case R.id.ee561:
			i.putExtra("course", "ee561");
			startActivity(i);
			break;

		case R.id.ee562:
			i.putExtra("course", "ee562");
			startActivity(i);
			break;

		case R.id.ee568:
			i.putExtra("course", "ee568");
			startActivity(i);
			break;

		case R.id.ee575:
			i.putExtra("course", "ee575");
			startActivity(i);
			break;

		case R.id.ee583:
			i.putExtra("course", "ee583");
			startActivity(i);
			break;

		case R.id.ee584:
			i.putExtra("course", "ee584");
			startActivity(i);
			break;

		case R.id.ee585:
			i.putExtra("course", "ee585");
			startActivity(i);
			break;

		case R.id.ee586:
			i.putExtra("course", "ee586");
			startActivity(i);
			break;

		case R.id.ee587:
			i.putExtra("course", "ee587");
			startActivity(i);
			break;

		case R.id.ee588:
			i.putExtra("course", "ee588");
			startActivity(i);
			break;

		case R.id.ee589:
			i.putExtra("course", "ee589");
			startActivity(i);
			break;

		case R.id.ee590:
			i.putExtra("course", "ee590");
			startActivity(i);
			break;

		case R.id.ee595:
			i.putExtra("course", "ee595");
			startActivity(i);
			break;

		case R.id.ee596:
			i.putExtra("course", "ee596");
			startActivity(i);
			break;

		case R.id.ee599:
			i.putExtra("course", "ee599");
			startActivity(i);
			break;

		case R.id.ee602:
			i.putExtra("course", "ee602");
			startActivity(i);
			break;

		case R.id.ee603:
			i.putExtra("course", "ee603");
			startActivity(i);
			break;

		case R.id.ee605:
			i.putExtra("course", "ee605");
			startActivity(i);
			break;

		case R.id.ee606:
			i.putExtra("course", "ee606");
			startActivity(i);
			break;

		case R.id.ee608:
			i.putExtra("course", "ee608");
			startActivity(i);
			break;

		case R.id.ee609:
			i.putExtra("course", "ee609");
			startActivity(i);
			break;

		case R.id.ee610:
			i.putExtra("course", "ee610");
			startActivity(i);
			break;

		case R.id.ee611:
			i.putExtra("course", "ee611");
			startActivity(i);
			break;

		case R.id.ee612:
			i.putExtra("course", "ee612");
			startActivity(i);
			break;

		case R.id.ee613:
			i.putExtra("course", "ee613");
			startActivity(i);
			break;

		case R.id.ee615:
			i.putExtra("course", "ee615");
			startActivity(i);
			break;

		case R.id.ee616:
			i.putExtra("course", "ee616");
			startActivity(i);
			break;

		case R.id.ee617:
			i.putExtra("course", "ee617");
			startActivity(i);
			break;

		case R.id.ee619:
			i.putExtra("course", "ee619");
			startActivity(i);
			break;

		case R.id.ee620:
			i.putExtra("course", "ee620");
			startActivity(i);
			break;

		case R.id.ee621:
			i.putExtra("course", "ee621");
			startActivity(i);
			break;

		case R.id.ee626:
			i.putExtra("course", "ee626");
			startActivity(i);
			break;

		case R.id.ee627:
			i.putExtra("course", "ee627");
			startActivity(i);
			break;

		case R.id.ee628:
			i.putExtra("course", "ee628");
			startActivity(i);
			break;

		case R.id.ee631:
			i.putExtra("course", "ee631");
			startActivity(i);
			break;

		case R.id.ee647:
			i.putExtra("course", "ee647");
			startActivity(i);
			break;

		case R.id.ee651:
			i.putExtra("course", "ee651");
			startActivity(i);
			break;

		case R.id.ee653:
			i.putExtra("course", "ee653");
			startActivity(i);
			break;

		case R.id.ee663:
			i.putExtra("course", "ee663");
			startActivity(i);
			break;

		case R.id.ee664:
			i.putExtra("course", "ee664");
			startActivity(i);
			break;

		case R.id.ee666:
			i.putExtra("course", "ee666");
			startActivity(i);
			break;

		case R.id.ee670:
			i.putExtra("course", "ee670");
			startActivity(i);
			break;

		case R.id.ee672:
			i.putExtra("course", "ee672");
			startActivity(i);
			break;

		case R.id.ee673:
			i.putExtra("course", "ee673");
			startActivity(i);
			break;

		case R.id.ee674:
			i.putExtra("course", "ee674");
			startActivity(i);
			break;

		case R.id.ee681:
			i.putExtra("course", "ee681");
			startActivity(i);
			break;

		case R.id.ee683:
			i.putExtra("course", "ee683");
			startActivity(i);
			break;

		case R.id.ee684:
			i.putExtra("course", "ee684");
			startActivity(i);
			break;

		case R.id.ee685:
			i.putExtra("course", "ee685");
			startActivity(i);
			break;

		case R.id.ee686:
			i.putExtra("course", "ee686");
			startActivity(i);
			break;

		case R.id.ee690:
			i.putExtra("course", "ee690");
			startActivity(i);
			break;

		case R.id.ee693:
			i.putExtra("course", "ee693");
			startActivity(i);
			break;

		case R.id.ee695:
			i.putExtra("course", "ee695");
			startActivity(i);
			break;

		case R.id.ee700:
			i.putExtra("course", "ee700");
			startActivity(i);
			break;

		case R.id.ee701:
			i.putExtra("course", "ee701");
			startActivity(i);
			break;

		case R.id.ee710:
			i.putExtra("course", "ee710");
			startActivity(i);
			break;

		case R.id.ee740:
			i.putExtra("course", "ee740");
			startActivity(i);
			break;

		case R.id.ee775:
			i.putExtra("course", "ee775");
			startActivity(i);
			break;

		case R.id.ee787:
			i.putExtra("course", "ee787");
			startActivity(i);
			break;

		case R.id.ee800:
			i.putExtra("course", "ee800");
			startActivity(i);
			break;

		case R.id.ee801:
			i.putExtra("course", "ee801");
			startActivity(i);
			break;

		case R.id.ee810:
			i.putExtra("course", "ee810");
			startActivity(i);
			break;

		case R.id.ee900:
			i.putExtra("course", "ee900");
			startActivity(i);
			break;

		case R.id.ee950:
			i.putExtra("course", "ee950");
			startActivity(i);
			break;

		case R.id.ee960:
			i.putExtra("course", "ee960");
			startActivity(i);
			break;
		}

	}

	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);


	}
}
