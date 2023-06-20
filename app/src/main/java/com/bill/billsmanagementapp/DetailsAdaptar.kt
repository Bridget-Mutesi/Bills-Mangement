package com.bill.billsmanagementapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bill.billsmanagementapp.databinding.ContactListDeatialsBinding

class DetailsAdaptar (var detailsList: List<ContactsDetails>): RecyclerView.Adapter<DetailsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        var binding = ContactListDeatialsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DetailsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return detailsList.size
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        var detail = detailsList.get(position)
        var binding = holder.binding
        holder.binding.tvName.text = detail.name
        holder.binding.tvNumber.text = detail.number
        holder.binding.tvemail.text = detail.email
//        Picasso
//            .get()
//            .load(detail.avatar)
//            .resize(80,80)
//            .transform(CropCircleTransformation())
//            .centerCrop()
//            .into(binding.ivavatar)
    }
}
class DetailsViewHolder(var binding: ContactListDeatialsBinding): RecyclerView.ViewHolder(binding.root){

}