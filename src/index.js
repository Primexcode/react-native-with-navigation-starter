import { Navigation } from 'react-native-navigation'
import Splash from './screens/splash'
import Screen1 from './screens/screen1'
import Screen2 from './screens/screen2'
import Screen3 from './screens/screen3'
import modalScreen from './screens/modalScreen'

export default () => {
  Navigation.registerComponent('Splash', () => Splash);
  Navigation.registerComponent('Screen1', () => Screen1);
  Navigation.registerComponent('Screen2', () => Screen2);
  Navigation.registerComponent('Screen3', () => Screen3);
  Navigation.registerComponent('modalScreen', () => modalScreen);

  Navigation.startSingleScreenApp({
    screen:{
      screen: 'Splash',
      navigatorStyle: {},
      navigatorButtons: {}
    }
  })
}