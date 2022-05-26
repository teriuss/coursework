package com.example.doctors.ui.doctors;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.doctors.R;
import com.example.doctors.models.Doctor;

import java.util.ArrayList;

public class DoctorsViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<Doctor>> persons;
    private ArrayList<Doctor> docs;

    public void setList(ArrayList<Doctor> doctors) {
        docs = doctors;
        init();
    }

    public DoctorsViewModel() {
        persons = new MutableLiveData<>();
        init();
    }

    private void init(){
        populateList();
        persons.setValue(docs);
    }

    private void populateList(){
        docs = new ArrayList<>();

        docs.add(new Doctor("Спортивка", "1900-сом","Спортивная одежда", R.drawable.wear11));
        docs.add(new Doctor("Костюм", "5990-сом","Классический", R.drawable.wear2));
        docs.add(new Doctor("Рубашка", "1500-сом","Полуклассика", R.drawable.wear3));
        docs.add(new Doctor("Штаны", "2000-сом","Полуклассика", R.drawable.wear4));
        docs.add(new Doctor("Футболка", "1700-сом","Polo", R.drawable.wear5));
        docs.add(new Doctor("Штаны", "2500-сом","Спортивная одежда", R.drawable.wear6));
        docs.add(new Doctor("Футболка", "1500-сом","Спортивная одежада", R.drawable.wear7));
        docs.add(new Doctor("Кепка", "2000-сом","Спортивная одежада", R.drawable.wear8));
        docs.add(new Doctor("Куртка", "4500-сом","Универсал", R.drawable.wear9));
        docs.add(new Doctor("Пальто", "8000-сом","Полуклассика", R.drawable.wear10));
        docs.add(new Doctor("Галстук", "600-сом","Полуклассика", R.drawable.wear11));

    }

    public LiveData<ArrayList<Doctor>> getMutableLiveData() {
        return persons;
    }
}