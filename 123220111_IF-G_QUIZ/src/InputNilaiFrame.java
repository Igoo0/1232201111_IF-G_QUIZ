/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Lenovo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputNilaiFrame extends JFrame {
    private JTextField textFieldNama;
    private JTextField textFieldNim;
    private JTextField textFieldNilaiTugas;
    private JTextField textFieldNilaiQuiz;
    private JRadioButton radioKelasPraktikum;
    private JRadioButton radioKelasTeori;
    private JComboBox<String> comboBoxMataKuliah;
    private JButton buttonSubmit;
    private JButton buttonLogout;
    
    private JTextField textFieldNamaHasil;
    private JTextField textFieldNimHasil;
    private JTextField textFieldTipe;
    private JTextField textFieldMataKuliah;
    private JTextField textFieldHasil;
    private JTextField textFieldTotalNilai;
    
    public InputNilaiFrame() {
        setTitle("INPUT NILAI");
        setSize(500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        textFieldNama = new JTextField();
        textFieldNim = new JTextField();
        textFieldNilaiTugas = new JTextField();
        textFieldNilaiQuiz = new JTextField();
        radioKelasPraktikum = new JRadioButton("Kelas Praktikum");
        radioKelasTeori = new JRadioButton("Kelas Teori");
        ButtonGroup buttonGroupKelas = new ButtonGroup();
        buttonGroupKelas.add(radioKelasPraktikum);
        buttonGroupKelas.add(radioKelasTeori);
        comboBoxMataKuliah = new JComboBox<>(new String[]{"PBO", "SCPK", "Algo Lanjut"});
        buttonSubmit = new JButton("Submit");
        buttonLogout = new JButton("Log-out");

        textFieldNamaHasil = new JTextField();
        textFieldNimHasil = new JTextField();
        textFieldTipe = new JTextField();
        textFieldMataKuliah = new JTextField();
        textFieldHasil = new JTextField();
        textFieldTotalNilai = new JTextField();
        
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JLabel("HALAMAN INPUT NILAI"));
        add(new JLabel("Nama :"));
        add(textFieldNama);
        add(new JLabel("NIM :"));
        add(textFieldNim);
        add(new JLabel("Tipe Kelas:"));
        add(radioKelasPraktikum);
        add(radioKelasTeori);
        add(new JLabel("Mata Kuliah:"));
        add(comboBoxMataKuliah);
        add(new JLabel("Nilai Tugas:"));
        add(textFieldNilaiTugas);
        add(new JLabel("Nilai Quiz:"));
        add(textFieldNilaiQuiz);
        add(buttonSubmit);
        add(buttonLogout);
        add(new JLabel("TRANSKRIP NILAI"));
        add(new JLabel("Nama :"));
        add(textFieldNamaHasil);
        add(new JLabel("NIM :"));
        add(textFieldNimHasil);
        add(new JLabel("Tipe Kelas:"));
        add(textFieldTipe);
        add(new JLabel("Mata Kuliah:"));
        add(textFieldMataKuliah);
        add(new JLabel("Hasil:"));
        add(textFieldHasil);
        add(new JLabel("Total Nilai:"));
        add(textFieldTotalNilai);
       
        
       
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             
                String nama = textFieldNama.getText();
                
                int nim = Integer.parseInt(textFieldNim.getText());
                double nilaiTugas = Double.parseDouble(textFieldNilaiTugas.getText());
                double nilaiQuiz = Double.parseDouble(textFieldNilaiQuiz.getText());
                String tipeKelas = radioKelasPraktikum.isSelected() ? "Kelas Praktikum" : "Kelas Teori";
                String mataKuliah = comboBoxMataKuliah.getSelectedItem().toString();

                Mahasiswa mahasiswa = new Mahasiswa(nama, nim, nilaiTugas, nilaiQuiz, tipeKelas, mataKuliah);
                double totalNilai = mahasiswa.hitungTotalNilai();
                String hasilPenilaian = mahasiswa.hasilPenilaian();
                textFieldNamaHasil.setText(String.valueOf(nama));
                textFieldNimHasil.setText(String.valueOf(nim));
                textFieldTipe.setText(String.valueOf(tipeKelas));
                textFieldMataKuliah.setText(String.valueOf(mataKuliah));
                textFieldHasil.setText(String.valueOf(hasilPenilaian));
                textFieldTotalNilai.setText(String.valueOf(totalNilai));
                
                
                
            }
        });


        buttonLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        InputNilaiFrame inputNilaiFrame = new InputNilaiFrame();
    }
}

