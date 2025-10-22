using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Ejemplo1
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();

            List<Poblaciones> listaPob = new List<Poblaciones>();
            listaPob.Add(new Poblaciones() { Poblacion1 = "Madrid",
                Poblacion2 = "Barcelona", Temp1 = "10", Temp2 = "20" });

            listaPob.Add(new Poblaciones() { Poblacion1 = "Valencia",
                Poblacion2 = "Alicante", Temp1 = "10", Temp2 = "20" });

            listaPob.Add(new Poblaciones() { Poblacion1 = "Malaga",
                Poblacion2 = "Bilbao", Temp1 = "10", Temp2 = "20" });

            listaPob.Add(new Poblaciones() { Poblacion1 = "Sevilla",
                Poblacion2 = "Coruña", Temp1 = "10", Temp2 = "20" });

            ListaPoblaciones.ItemsSource = listaPob;
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if (ListaPoblaciones.SelectedItem != null)
            {
                MessageBox.Show((ListaPoblaciones.SelectedItem as Poblaciones).Poblacion1 + " " +
                    (ListaPoblaciones.SelectedItem as Poblaciones).Temp1 + " C " +
                    (ListaPoblaciones.SelectedItem as Poblaciones).Poblacion2 + " " +
                    (ListaPoblaciones.SelectedItem as Poblaciones).Temp2 + " C ");
            }
            else
            {
                MessageBox.Show("Selecciona de la lista");
            }
        }
    }

    public class Poblaciones
    {
        public string Poblacion1 {  get; set; }
        public string Temp1 { get; set; }
        public string Poblacion2 { get; set; }
        public string Temp2 { get; set; }
    }
}
