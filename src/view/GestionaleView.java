/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sidahmed.riri
 */
public class GestionaleView extends JFrame {

    private final JPanel pnlHeader;
    private final JLabel lblTitolo;

    private final JPanel pnlControlli;

    private final JPanel pnlCatalogo;
    private final JButton btnMostraCatalogo;

    private final JPanel pnlCarrello;
    private final JButton btnCarrelloPrecedente;
    private final JButton btnCarrelloSuccessivo;
    private final JLabel lblCarrello;

    private final JPanel pnlOrdiniAcquisto;
    private final JButton btnAggiungiOrdineAcquisto;
    private final JButton btnMostraOrdiniAcquisto;
    
    private final JPanel pnlSpedizioni;
    private final JButton btnRiceviOrdineSpedizione;
    private final JButton btnEvadiOrdineSpedizione;
    
    private final JPanel pnlRotte;
    private final JButton btnMostraRotte;
    
    private final JPanel pnlAzioniSviluppo;
    private final JButton btnEseguiAzione;
    private final JButton btnAnnullaAzione;
    
    private final JPanel pnlOutput;
    private final JTextArea txtConsole;
}
