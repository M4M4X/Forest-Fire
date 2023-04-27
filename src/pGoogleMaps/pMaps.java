package pGoogleMaps;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import pComponents.button.MyButton;
import pGeneration.GenerationProcedurale;
import projet_simulation_feu.Case;
import projet_simulation_feu.DiamondSquare;
import projet_simulation_feu.Humidite;
import projet_simulation_feu.Terrain;
import projet_simulation_feu.Vent;

/**
 *
 * @author maxim
 */
public class pMaps extends javax.swing.JPanel {

    private int TailleX = 512;
    private int TailleY;
    private File FichierSelectionne;
    private BufferedImage img;
    private Image newImg;
    private Terrain terrain;
    private Vent vent;
    private Humidite humidite;
    private DiamondSquare DS;
    private Case [][] grilletemp;
    private final String NewDestination = "./temp.png"; //Destination de l'image redimensionnée
    private javax.swing.JPanel simu = new GenerationProcedurale();
        
    public pMaps() {        
        initComponents();
        //pParametreMeteoMaps.setVisible(false);
        bGenerer.setVisible(false);
        bParametre.setVisible(false);
        //generationProcedurale1.setVisible(false);
        
        
        DS = null;
        vent = null;
        humidite = null;
        terrain = new Terrain(TailleX, vent, humidite, HEIGHT, DS);
        
    }

    //Getter and Setter
    public MyButton getbParametre() {
        return bParametre;
    }

    public Terrain getTerrain() {
        return terrain;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pGenerationMaps = new javax.swing.JPanel();
        bChoisirFichier = new pComponents.button.MyButton();
        bGenerer = new pComponents.button.MyButton();
        lApercu = new javax.swing.JLabel();
        pGeneration = new pGoogleMaps.pTranscription();
        bParametre = new pComponents.button.MyButton();
        switchMaps = new pComponents.switch_button.SwitchButton();
        lVueSatellite = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        setMaximumSize(new java.awt.Dimension(20000, 700));
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setPreferredSize(new java.awt.Dimension(1300, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pGenerationMaps.setBackground(new java.awt.Color(40, 34, 64));
        pGenerationMaps.setForeground(new java.awt.Color(40, 34, 64));
        pGenerationMaps.setMaximumSize(new java.awt.Dimension(1300, 700));
        pGenerationMaps.setPreferredSize(new java.awt.Dimension(1300, 700));

        bChoisirFichier.setBackground(new java.awt.Color(191, 94, 94));
        bChoisirFichier.setForeground(new java.awt.Color(255, 255, 255));
        bChoisirFichier.setText("Choisir un fichier");
        bChoisirFichier.setBorderColor(new java.awt.Color(191, 94, 94));
        bChoisirFichier.setBorderPainted(false);
        bChoisirFichier.setColor(new java.awt.Color(191, 94, 94));
        bChoisirFichier.setColorClick(new java.awt.Color(171, 74, 74));
        bChoisirFichier.setColorOver(new java.awt.Color(191, 94, 94));
        bChoisirFichier.setRadius(50);
        bChoisirFichier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bChoisirFichierMouseClicked(evt);
            }
        });

        bGenerer.setBackground(new java.awt.Color(242, 113, 65));
        bGenerer.setBorder(null);
        bGenerer.setForeground(new java.awt.Color(255, 255, 255));
        bGenerer.setText("Générer une carte");
        bGenerer.setBorderColor(new java.awt.Color(242, 113, 65));
        bGenerer.setBorderPainted(false);
        bGenerer.setColor(new java.awt.Color(242, 113, 65));
        bGenerer.setColorClick(new java.awt.Color(222, 93, 45));
        bGenerer.setColorOver(new java.awt.Color(242, 113, 65));
        bGenerer.setRadius(50);
        bGenerer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bGenererMouseClicked(evt);
            }
        });

        lApercu.setBackground(new java.awt.Color(60, 68, 115));
        lApercu.setForeground(new java.awt.Color(60, 68, 115));
        lApercu.setMaximumSize(new java.awt.Dimension(512, 512));
        lApercu.setMinimumSize(new java.awt.Dimension(512, 512));
        lApercu.setOpaque(true);
        lApercu.setPreferredSize(new java.awt.Dimension(512, 512));

        pGeneration.setForeground(new java.awt.Color(40, 34, 64));
        pGeneration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pGenerationMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pGenerationLayout = new javax.swing.GroupLayout(pGeneration);
        pGeneration.setLayout(pGenerationLayout);
        pGenerationLayout.setHorizontalGroup(
            pGenerationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        pGenerationLayout.setVerticalGroup(
            pGenerationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        bParametre.setBackground(new java.awt.Color(242, 143, 56));
        bParametre.setForeground(new java.awt.Color(255, 255, 255));
        bParametre.setText("Définir les paramètres");
        bParametre.setBorderColor(new java.awt.Color(242, 143, 56));
        bParametre.setBorderPainted(false);
        bParametre.setColor(new java.awt.Color(242, 143, 56));
        bParametre.setColorClick(new java.awt.Color(222, 123, 36));
        bParametre.setColorOver(new java.awt.Color(242, 143, 56));
        bParametre.setName(""); // NOI18N
        bParametre.setRadius(50);
        bParametre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bParametreMouseClicked(evt);
            }
        });

        switchMaps.setBackground(new java.awt.Color(30, 120, 0));
        switchMaps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                switchMapsMouseReleased(evt);
            }
        });

        lVueSatellite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lVueSatellite.setForeground(new java.awt.Color(255, 255, 255));
        lVueSatellite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lVueSatellite.setText("Vue Satellite de Maps");

        javax.swing.GroupLayout pGenerationMapsLayout = new javax.swing.GroupLayout(pGenerationMaps);
        pGenerationMaps.setLayout(pGenerationMapsLayout);
        pGenerationMapsLayout.setHorizontalGroup(
            pGenerationMapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGenerationMapsLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(lApercu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGenerationMapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pGenerationMapsLayout.createSequentialGroup()
                        .addGroup(pGenerationMapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bChoisirFichier, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bParametre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bGenerer, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lVueSatellite, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGenerationMapsLayout.createSequentialGroup()
                        .addComponent(switchMaps, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addComponent(pGeneration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        pGenerationMapsLayout.setVerticalGroup(
            pGenerationMapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGenerationMapsLayout.createSequentialGroup()
                .addGroup(pGenerationMapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pGenerationMapsLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(bChoisirFichier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lVueSatellite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(switchMaps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(bGenerer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(bParametre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pGenerationMapsLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pGenerationMapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pGeneration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lApercu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        add(pGenerationMaps, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void switchMapsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchMapsMouseReleased
        if (switchMaps.isSelected()){
            pGeneration.setSatellite(true);
        } else {
            pGeneration.setSatellite(false);
        }
    }//GEN-LAST:event_switchMapsMouseReleased

    private void bParametreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bParametreMouseClicked
        bChoisirFichier.setVisible(false);
        bGenerer.setVisible(false);
        switchMaps.setVisible(false);
        switchMaps.setVisible(false);
        lVueSatellite.setVisible(false);
        lApercu.setVisible(false);
        bParametre.setVisible(false);
        pGenerationMaps.setVisible(false);
    }//GEN-LAST:event_bParametreMouseClicked

    private void bGenererMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bGenererMouseClicked
        try {
            img = ImageIO.read(FichierSelectionne);
            pGeneration.setFichierSelectionne(new File(NewDestination));
            pGeneration.setTailleX(TailleX);
            pGeneration.setTailleY(TailleY);
            pGeneration.setImg(ImageIO.read(new File(NewDestination)));
            pGeneration.repaint();
            bParametre.setVisible(true);
            terrain = pGeneration.getTerrain();
        } catch (IOException ex) {
            Logger.getLogger(pMaps.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bGenererMouseClicked

    private void bChoisirFichierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bChoisirFichierMouseClicked
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //Permet d'avoir l'explorateur de fichier de windows 7
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home"))); //définit le point d'apparition pour l'explorateur
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image JPG et PNG","jpg","png","JPG","PNG"));
            fileChooser.setAcceptAllFileFilterUsed(false); //Force les filtres pour la selection du fichier
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                FichierSelectionne = fileChooser.getSelectedFile();
                String adresse = FichierSelectionne.getAbsolutePath();
                lApercu.setIcon(RedimensionnerPourIcon(adresse));
                bGenerer.setVisible(true);
            }
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) { //Permet de remettre l'interface de base
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | IOException ex) {
            Logger.getLogger(pMaps.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bChoisirFichierMouseClicked

    private void pGenerationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGenerationMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pGenerationMousePressed
    
    public ImageIcon RedimensionnerPourIcon(String adresse) throws IOException {
        /*
            Cette méthode rédimensionne une image grâce aux méthodes de la classe ImmageIcon.
            La sortie est l'image redimensionner qui sera utilisée pour faire un aperçu.
        */
        ImageIcon icon = new ImageIcon(adresse);
        Image imgIcon = icon.getImage();
        TailleX = lApercu.getWidth();
        TailleY = lApercu.getHeight();
        newImg = imgIcon.getScaledInstance(TailleX, TailleY, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        RedimensionnerEtSauver(adresse, TailleX);
        return image;
    }
    
    public void RedimensionnerEtSauver(String adresse, int taille) throws IOException {
        /*
            Cette méthode redimensionne une image avec la classe BufferedImage pour ensuite l'enregistrer.
        */
        File fileToRead = new File(adresse);
        BufferedImage bufferedImageInput = ImageIO.read(fileToRead);
        BufferedImage bufferedImageOutput = new BufferedImage(taille,taille, bufferedImageInput.getType());
        Graphics2D g2d = bufferedImageOutput.createGraphics();
        g2d.drawImage(bufferedImageInput, 0, 0, taille, taille, null);
        g2d.dispose();
        ImageIO.write(bufferedImageOutput, "png", new File(NewDestination));
    }
    
    public BufferedImage Convertir (){
        return null;
    }
    
    public void addSimu(ActionListener evt){
        bParametre.addActionListener(evt);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pComponents.button.MyButton bChoisirFichier;
    private pComponents.button.MyButton bGenerer;
    private pComponents.button.MyButton bParametre;
    private javax.swing.JLabel lApercu;
    private javax.swing.JLabel lVueSatellite;
    private pGoogleMaps.pTranscription pGeneration;
    private javax.swing.JPanel pGenerationMaps;
    private pComponents.switch_button.SwitchButton switchMaps;
    // End of variables declaration//GEN-END:variables

}
