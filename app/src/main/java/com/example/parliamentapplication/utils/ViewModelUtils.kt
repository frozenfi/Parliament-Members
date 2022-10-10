package com.example.parliamentapplication.utils
/*
* Name: Binod Panta
* Student No: 2012206
* Date: 08.10.2022
*/
import androidx.lifecycle.LiveData
import com.example.parliamentapplication.ParliamentMembers
import com.example.parliamentapplication.data.Feedback
import java.util.Calendar
/*
Utilities for the viewModel class to update age,formatted partyName and rating
 */

//TODO, will implement it later
interface ViewModelUtils {

    val selectMember:LiveData<ParliamentMembers>
    val memberComment:LiveData<Feedback>

    fun updateAge():String{
        val age:Int =(Calendar.getInstance().get(Calendar.YEAR))-(selectMember.value?.bornYear ?: 0)

        return if(age<Calendar.getInstance().get(Calendar.YEAR)) "Age: \n $age" else "Age: \n Error "
    }


    fun updateParty():String{
        val party = when(selectMember.value?.party) {
            "kd" -> "Suomen Kristillisdemokratit"
            "kesk" ->"Suomen Keskusta"
            "kok" ->"Kansallinen Kokoomus"
            "liik"->"Liike Nyt"
            "ps"->"Perus Suomalaiset"
            "r" ->"Suomen Ruotsalainen Kansanpuolue"
            "sd" ->" Suomen Sosialidemokraattinen"
            "vas"->"Vasemmistoliitto"
            else ->" Vihreä liitto"

        }
        return "Party: \n $party"
    }


 }