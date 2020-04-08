package com.example.cics;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class CropName extends AppCompatActivity {


    String Spinnervalue;
    private Button button;

    Intent intent;
    String[] SPINNERVALUES ={"Ambrette Seed, Chamomile, Davana, Eucalyptus citriodora, French Jasmine, Indian Basil/Tulsi, Jamarosa, Kewda/Panadanas, Lemon Grass, Patchouli, Rose Geranium, Vetiver /Khus," +
            "Cereals, Oil seeds, Pulses, Grasses and Legumes, other" +
            "Almond, Aonla, Apple, Apricot, Bael, Banana, Ber, Blueberry, ChestnutCherry, Custard Apple, Date Palm, Eurale Ferox (Makhana), Fig, Grape, Guava, Jackfruit, Kiwi, Limes and Lemons, Litchi, Mandarin, Mango, Muskmelon, Papaya, Passion Fruit, Peach, Pear, Picanut, Pineapple, Plum, Pomegranate, Sapota, Strawberry, Sweet Orange, Walnut, Water Melon"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_name);


        final Spinner Aromatic = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(CropName.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Aromatic));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Aromatic.setAdapter(myAdapter);

        Aromatic.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (Spinnervalue = (String) Aromatic.getSelectedItem()) {
                    case "Ambrette Seed":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Chamomile":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item1 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Davana":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item3 = adapterView.getItemAtPosition(i).toString();
                        break;


                    case "Eucalyptus citriodora":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item4 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "French Jasmine":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item5 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Indian Basil/Tulsi":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item6 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Jamarosa":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item7 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Kewda/Panadanas":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item8 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Lemon Grass":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item9 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Palmarosa":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item10 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Patchouli":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item11 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Rose Geranium":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item12 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Vetiver /Khus":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item13 = adapterView.getItemAtPosition(i).toString();
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        final Spinner Field = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> fieAdapter = new ArrayAdapter<String>(CropName.this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Field));
        fieAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Field.setAdapter(fieAdapter);

        Field.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (Spinnervalue = (String) Field.getSelectedItem()) {
                    case "Cereals":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Oil seeds":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item2 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Pulses":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item3 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Grasses and Legumes":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item4 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Others":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item5 = adapterView.getItemAtPosition(i).toString();
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        final Spinner Fruits = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> fruAdapter = new ArrayAdapter<String>(CropName.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Fruit));
        fruAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Fruits.setAdapter(fruAdapter);

        Fruits.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (Spinnervalue = (String) Fruits.getSelectedItem()) {
                    case "Almond":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item = adapterView.getItemAtPosition(i).toString();
                        break;


                    case "Aonla":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item1 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Apple":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item2 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Apricot":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item3 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Bael":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item4 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Ber":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item5 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Blueberry":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item6 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "ChestnutCherry":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item7 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Custard Apple":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item8 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Date Palm":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item9 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Eurale Ferox (Makhana)":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item10 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Fig":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item11 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Grape":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item12 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Guava":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item13 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Jackfruit":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item14 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Kiwi":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item15 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Limes and Lemons":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item16 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Litchi":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item17 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Mandarin":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item18 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Mango":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item19 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Muskmelon":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item20 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Papaya":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item21 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Passion Fruit":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item22 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Peach":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item23 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Pear":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item24 = adapterView.getItemAtPosition(i).toString();
                        break;


                    case "Picanut":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item25 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Pineapple":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item26 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Plum":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item27 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Pomegranate":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item28 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Sapota":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item29 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Strawberry":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item30 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Sweet Orange":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item31 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Walnut":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item32 = adapterView.getItemAtPosition(i).toString();
                        break;

                    case "Water Melon":
                        intent = new Intent(CropName.this,Form.class);
                        intent.putExtra("data",String.valueOf(Spinnervalue));
                        startActivity(intent);
                        String item33 = adapterView.getItemAtPosition(i).toString();
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner Flowers = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<String> floAdapter = new ArrayAdapter<String>(CropName.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Flower));
        floAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Flowers.setAdapter(floAdapter);

        Flowers.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner medSpinner = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter<String> medAdapter = new ArrayAdapter<String>(CropName.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Medicinal));
        medAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        medSpinner.setAdapter(medAdapter);

        Spinner plaSpinner = (Spinner) findViewById(R.id.spinner6);
        ArrayAdapter<String> plaAdapter = new ArrayAdapter<String>(CropName.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Plantation));
        plaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        plaSpinner.setAdapter(plaAdapter);

        Spinner spiSpinner = (Spinner) findViewById(R.id.spinner7);
        ArrayAdapter<String> spiAdapter = new ArrayAdapter<String>(CropName.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Spices));
        spiAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiSpinner.setAdapter(spiAdapter);

        Spinner vegSpinner = (Spinner) findViewById(R.id.spinner8);
        ArrayAdapter<String> vegAdapter = new ArrayAdapter<String>(CropName.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Vegetable));
        vegAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vegSpinner.setAdapter(vegAdapter);

    }
}
