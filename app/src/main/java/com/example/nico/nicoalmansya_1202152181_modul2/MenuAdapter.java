package com.example.nico.nicoalmansya_1202152181_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by Nico on 18/02/2018.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{

    private final LinkedList<String> mMakananList;
    private final LinkedList<Integer> mHargaList;
    private final LinkedList<Integer> mFotoList;
    private final LinkedList<String> mKomposisiList;
    private LayoutInflater mInflater;

    public MenuAdapter(Context context, LinkedList<String> makananList, LinkedList<Integer> hargaList, LinkedList<Integer> fotoList, LinkedList<String> komposisiList) {
        mInflater = LayoutInflater.from(context);
        this.mMakananList = makananList;
        this.mHargaList = hargaList;
        this.mFotoList = fotoList;
        this.mKomposisiList = komposisiList;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_list_menu, parent, false);
        return new MenuViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        String mCurrentMakanan = mMakananList.get(position);
        Integer mCurrentHarga = mHargaList.get(position);
        Integer mCurrentFoto = mFotoList.get(position);
        holder.makananItemView.setText(mCurrentMakanan);
        holder.hargaItemView.setText("Rp."+mCurrentHarga.toString());
        holder.fotoItemView.setImageResource(mCurrentFoto);
    }

    @Override
    public int getItemCount() {
        return mMakananList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView makananItemView;
        public final TextView hargaItemView;
        public final ImageView fotoItemView;

        final MenuAdapter mAdapter;

        public MenuViewHolder(final View itemView, MenuAdapter adapter) {
            super(itemView);
            makananItemView = (TextView) itemView.findViewById(R.id.tv_food);
            hargaItemView = (TextView) itemView.findViewById(R.id.tv_price);
            fotoItemView = (ImageView) itemView.findViewById(R.id.iv_photo);
            fotoItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Get the position of the item that was clicked.
                    int mPosition = getLayoutPosition();
                    // Use that to access the affected item in mWordList.
                    String makanan = mMakananList.get(mPosition);
                    Integer harga = mHargaList.get(mPosition);
                    Integer foto = mFotoList.get(mPosition);
                    String komposisi = mKomposisiList.get(mPosition);
                    Intent intent = new Intent(itemView.getContext(), DetailMenu.class);
                    intent.putExtra("makanan", makanan);
                    intent.putExtra("harga", harga);
                    intent.putExtra("foto", foto);
                    intent.putExtra("komposisi",komposisi);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.mAdapter = adapter;
        }

        @Override
        public void onClick(View view) {

        }
    }
}

