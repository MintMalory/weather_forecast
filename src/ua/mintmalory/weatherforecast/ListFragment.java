package ua.mintmalory.weatherforecast;

import java.util.ArrayList;

import ua.mintmalory.weatherforecast.R.id;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListFragment extends Fragment {
	private ListView mForecastList;
	public ListFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_list,
				container);
		ArrayList<String> fakeData = new ArrayList<String>();

		fakeData.add("Today - Sunny - 88/63");
		fakeData.add("Tomorrow - Foggy - 88/63");
		fakeData.add("Monday - Cloudy - 88/63");
		fakeData.add("Tuesday - Rainy - 88/63");
		fakeData.add("Wensday - Sunny - 88/63");
		fakeData.add("Thusday - Cloudy - 88/63");

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				R.layout.list_item_forecast, R.id.list_item_forecast_textview, fakeData);

		mForecastList = (ListView) rootView.findViewById(id.listview_forecast);
		mForecastList.setAdapter(adapter);
		return rootView;
	}
}
