package com.example.drawernavandbottomnav


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.drawernavandbottomnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var actionBarDrawerTaggle:ActionBarDrawerToggle
private val binding by lazy {
    ActivityMainBinding.inflate(layoutInflater)
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var navController = findNavController(R.id.fragmentContainerView)
        binding.bottomNavView.setupWithNavController(navController)



        actionBarDrawerTaggle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.nav_open, R.string.nav_close);
        actionBarDrawerTaggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.draweNav.setNavigationItemSelectedListener {menuItem->


            when(menuItem.itemId) {
                R.id.BMIFragment -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
                }

                R.id.unitFragment -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
                }

                R.id.ageFragment -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
                }

                R.id.dark -> {
                    binding.drawerLayout.setBackgroundColor(getColor(R.color.black))
                }

                R.id.light -> {
                    binding.drawerLayout.setBackgroundColor(getColor(R.color.white))
                }

                R.id.orange -> {
                    binding.drawerLayout.setBackgroundColor(getColor(R.color.overweight))
                }

            }

            true
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if(actionBarDrawerTaggle.onOptionsItemSelected(item)){
            true
        }
        else super.onOptionsItemSelected(item)
    }
}