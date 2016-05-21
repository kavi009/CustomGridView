package com.example.subba.gridview.adapter;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.subba.customgridview.R;

public class CustomGridAdapter extends BaseAdapter {

        private Context context;
        private final String[] gridValues;

        //Constructor to initialize values
        public CustomGridAdapter(Context context, String[ ] gridValues) {

            this.context        = context;
            this.gridValues     = gridValues;
        }

        @Override
        public int getCount() {

            // Number of times getView method call depends upon gridValues.length
            return gridValues.length;
        }

        @Override
        public Object getItem(int position) {

            return null;
        }

        @Override
        public long getItemId(int position) {

            return 0;
        }


        // Number of times getView method call depends upon gridValues.length

        public View getView(int position, View convertView, ViewGroup parent) {

            // LayoutInflator to call external grid_item.xml file

            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View gridView;

            if (convertView == null) {

                gridView = new View(context);

                // get layout from grid_item.xml ( Defined Below )

                gridView = inflater.inflate( R.layout.grid_item , null);

                // set value into textview

                TextView textView = (TextView) gridView
                        .findViewById(R.id.grid_item_label);

                textView.setText(gridValues[position]);

                // set image based on selected text

                ImageView imageView = (ImageView) gridView
                        .findViewById(R.id.grid_item_image);

                String arrLabel = gridValues[ position ];

                if (arrLabel.equals("GingerBread")) {

                    imageView.setImageResource(R.mipmap.s1);

                } else if (arrLabel.equals("HoneyComb")) {

                    imageView.setImageResource(R.mipmap.s2);

                } else if (arrLabel.equals("IcecreamSandwich")) {

                    imageView.setImageResource(R.mipmap.s3);

                }else if (arrLabel.equals("JellyBean")) {

                    imageView.setImageResource(R.mipmap.s4);

                }else if (arrLabel.equals("KitKat")) {

                    imageView.setImageResource(R.mipmap.s5);

                }else if (arrLabel.equals("Lollipop")) {

                    imageView.setImageResource(R.mipmap.s61);

                }
                else {

                    imageView.setImageResource(R.mipmap.ic_launcher);
                }

            } else {

                gridView = (View) convertView;
            }

            return gridView;
        }
    }

