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

namespace Ejemplo2
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();

            List<Capitales> listaCapitales = new List<Capitales>();

            listaCapitales.Add(new Capitales() { NombreCapital= "Madrid" });
            listaCapitales.Add(new Capitales() { NombreCapital= "Londres" });
            listaCapitales.Add(new Capitales() { NombreCapital= "Berlin" });
            listaCapitales.Add(new Capitales() { NombreCapital= "Paris" });

            Capitales.ItemsSource = listaCapitales;
        }

        private void TodasC_Checked(object sender, RoutedEventArgs e)
        {
            Madrid.IsChecked = true;
            Londres.IsChecked = true;
            Berlin.IsChecked = true;
            Paris.IsChecked = true;
        }

        private void TodasC_Unchecked(object sender, RoutedEventArgs e)
        {
            Madrid.IsChecked = false;
            Londres.IsChecked = false;
            Berlin.IsChecked = false;
            Paris.IsChecked = false;
        }

        private void Individual_Checked(object sender, RoutedEventArgs e)
        {
            if(Madrid.IsChecked == true && Londres.IsChecked == true && Paris.IsChecked == true && Berlin.IsChecked == true)
            {
                TodasC.IsChecked = true;
            } else
            {
                TodasC.IsChecked = null;
            }
        }
    }

    public class Capitales
    {
        public string NombreCapital { get; set; }
    }
}
