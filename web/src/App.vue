<template>
 <!-- <div>Bot昵称：{{ bot_name }}</div>
 <div>Bot战力：{{ bot_rating }}</div> -->
 <NavBar />
 <router-view></router-view>
</template>

<script> 
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
export default {
  components : {
    NavBar
  }
}
</script>

<style>
body {
  background-image: url("@/assets/background.png");
  background-size: cover;
}
</style>
