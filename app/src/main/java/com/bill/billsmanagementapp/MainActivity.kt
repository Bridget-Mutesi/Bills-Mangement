package com.bill.billsmanagementapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bill.billsmanagementapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun displayDetails(){
        var contact1 = ContactsDetails("","rita@gmail.com")
        var contact2 = ContactsDetails("","Nicky","+254 750560784","nick@gmail.com")
        var contact3 = ContactsDetails("","Mercy","+256 70505893","mercy@gmail.com")



        var contactList = listOf<ContactsDetails>(contact1,contact2,contact3,)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        var ContactAdaptor = DetailsAdaptar(contactList)
        binding.rvContact.adapter = ContactAdaptor




    }
}