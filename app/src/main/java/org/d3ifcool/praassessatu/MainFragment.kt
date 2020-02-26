package org.d3ifcool.praassessatu


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import org.d3ifcool.praassessatu.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_main.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(
            inflater, R.layout.fragment_main, container, false
        )

        binding.btnPersegiPanjang.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_mainFragment_to_persegiPanjang)
        }
        binding.btnSegitiga.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_mainFragment_to_segitiga)
        }
       setHasOptionsMenu(true)
        return binding.root
    }
}
