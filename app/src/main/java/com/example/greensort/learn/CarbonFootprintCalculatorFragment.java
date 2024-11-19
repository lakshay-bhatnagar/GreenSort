package com.example.greensort.learn;

import static android.app.ProgressDialog.show;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.greensort.R;
import com.example.greensort.databinding.FragmentCarbonFootprintCalculatorBinding;

public class CarbonFootprintCalculatorFragment extends Fragment {

    private FragmentCarbonFootprintCalculatorBinding fragmentCarbonFootprintCalculatorBinding;
    private Button calculateBtn;
    private CardView resultCardView;
    private TextView emissionValue;
    private EditText electricity, gas, oil, mileage, flightLess, flightMore;
    private RadioGroup newspaperGroup, aluminumGroup;
    private RadioButton yesNewspaper, noNewspaper, yesAluminum, noAluminum;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentCarbonFootprintCalculatorBinding = FragmentCarbonFootprintCalculatorBinding.inflate(inflater, container, false);

        View view = fragmentCarbonFootprintCalculatorBinding.getRoot();

        // Initialize views
        resultCardView = fragmentCarbonFootprintCalculatorBinding.resultCardView;
        calculateBtn = fragmentCarbonFootprintCalculatorBinding.calculateEmission;
        emissionValue = fragmentCarbonFootprintCalculatorBinding.emissionValue;
        electricity = fragmentCarbonFootprintCalculatorBinding.electricityValue;
        gas = fragmentCarbonFootprintCalculatorBinding.gasbillValue;
        oil = fragmentCarbonFootprintCalculatorBinding.oilbillValue;
        mileage = fragmentCarbonFootprintCalculatorBinding.mileageValue;
        flightLess = fragmentCarbonFootprintCalculatorBinding.flightValueLess;
        flightMore = fragmentCarbonFootprintCalculatorBinding.flightValueMore;
        newspaperGroup = fragmentCarbonFootprintCalculatorBinding.newspaperGroup;
        aluminumGroup = fragmentCarbonFootprintCalculatorBinding.aluminumGroup;
        yesNewspaper = fragmentCarbonFootprintCalculatorBinding.yesNewspaper;
        noNewspaper = fragmentCarbonFootprintCalculatorBinding.noNewspaper;
        yesAluminum = fragmentCarbonFootprintCalculatorBinding.yesAluminum;
        noAluminum = fragmentCarbonFootprintCalculatorBinding.noAluminum;

        calculateBtn.setOnClickListener(v -> {
            try {
                int elecInt = Integer.parseInt(electricity.getText().toString());
                int gasInt = Integer.parseInt(gas.getText().toString());
                int oilInt = Integer.parseInt(oil.getText().toString());
                int milInt = Integer.parseInt(mileage.getText().toString());
                int fliLint = Integer.parseInt(flightLess.getText().toString());
                int fliMint = Integer.parseInt(flightMore.getText().toString());

                boolean isNewspaperRecycled = newspaperGroup.getCheckedRadioButtonId() == R.id.yesNewspaper;
                boolean isAluminumRecycled = aluminumGroup.getCheckedRadioButtonId() == R.id.yesAluminum;

                int calculateCO2Emission = calculationEmission(elecInt, gasInt, oilInt, milInt, fliLint, fliMint, isNewspaperRecycled, isAluminumRecycled);

                if (calculateCO2Emission > 0) {
                    emissionValue.setText(String.valueOf(calculateCO2Emission));
                    resultCardView.setVisibility(View.VISIBLE);
                }
            } catch (NumberFormatException e) {
                // Handle cases where the input is empty or invalid
                Toast.makeText(getActivity(), "Please fill all the fields", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    private int calculationEmission(int elec, int gas, int oil, int mil, int flightL, int flightM, boolean isNewspaperRecycled, boolean isAluminumRecycled) {
        // Multiply values by respective factors according to the formula
        elec *= 105;
        gas *= 105;
        oil *= 113;
        mil *= 0.79;
        flightL *= 1100; // Flights 4 hours or less
        flightM *= 4400; // Flights 4 hours or more
        int sum = 0;

        // Adjust emission values based on recycling habits
        if (!isNewspaperRecycled) {
            sum += 184; // Example adjustment, modify as needed
        }
        if (!isAluminumRecycled) {
            sum += 166; // Example adjustment, modify as needed
        }

        // Calculate the total sum
        return elec + gas + oil + (int) mil + flightL + flightM + sum;
    }
}
