package droidista.blogspot.com.ormsqliteassethelper;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

import droidista.blogspot.com.ormsqliteassethelper.orm.OrmDbHelper;
import droidista.blogspot.com.ormsqliteassethelper.pojo.Employee;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        OrmDbHelper mOrmDbHelper;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            TextView textView = (TextView) rootView.findViewById(R.id.sample_text);

            // Usually, you should try and NOT do DB operations in onCreateView.
            // But for demo purposes, let's break the rules.
            mOrmDbHelper = getHelper();
            try {

                Dao<Employee, Integer> employeeDao = mOrmDbHelper.getEmployeeDao();

                // Try to get the first entry in the table
                Employee employee = employeeDao.queryBuilder().queryForFirst();
                if(employee == null) {
                    textView.setText("No employees found!");
                } else {
                    textView.setText(employee.toString());
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return rootView;
        }

        /**
         * You'll need this in your class to get the helper from the manager once per class.
         */
        private OrmDbHelper getHelper() {
            if (mOrmDbHelper == null) {
                mOrmDbHelper = new OrmDbHelper(getActivity());
            }
            return mOrmDbHelper;
        }
    }
}
