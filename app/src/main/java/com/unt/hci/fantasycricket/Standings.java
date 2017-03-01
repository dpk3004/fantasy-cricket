package com.unt.hci.fantasycricket;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by jt on 2/26/17.
 */

public class Standings {

    /**
     * tournamentId : {"name":"ipl2015","id":2785}
     * groups : [{"standings":[{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-02","id":3227},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-04","id":3229},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-12","id":3237},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-15","id":3240},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-20","id":3245},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-24","id":3249},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-28","id":3253},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-30","id":3255},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-34","id":3259},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-37","id":3262},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-43","id":3268},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-47","id":3272},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-49","id":3274},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-53","id":3278},"outcome":"W"}],"totalRunsFor":2262,"totalRunsAgainst":2073,"totalBallsFor":1641,"totalBallsAgainst":1645,"bowlAvg":"22.0531914893617","positionLabel":"Q","netRunRate":"+0.709","position":1,"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1},"played":14,"won":9,"lost":5,"tied":0,"points":18},{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-01","id":3226},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-07","id":3232},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-09","id":3234},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-12","id":3237},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-16","id":3241},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-21","id":3246},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-23","id":3248},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-32","id":3257},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-35","id":3260},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-39","id":3264},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-43","id":3268},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-46","id":3271},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-51","id":3276},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-56","id":3281},"outcome":"W"}],"totalRunsFor":2345,"totalRunsAgainst":2371,"totalBallsFor":1636,"totalBallsAgainst":1646,"bowlAvg":"30.792207792207794","positionLabel":"Q","netRunRate":"-0.043","position":2,"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6},"played":14,"won":8,"lost":6,"tied":0,"points":16},{"noResult":2,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-05","id":3230},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-08","id":3233},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-16","id":3241},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-20","id":3245},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-22","id":3247},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-26","id":3251},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-29","id":3254},"outcome":"NR"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-33","id":3258},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-37","id":3262},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-40","id":3265},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-46","id":3271},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-50","id":3275},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-52","id":3277},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-55","id":3280},"outcome":"NR"}],"totalRunsFor":1790,"totalRunsAgainst":1693,"totalBallsFor":1147,"totalBallsAgainst":1220,"bowlAvg":"20.901234567901234","positionLabel":"Q","netRunRate":"+1.037","position":3,"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9},"played":14,"won":7,"lost":5,"tied":0,"points":16},{"noResult":2,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-03","id":3228},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-06","id":3231},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-09","id":3234},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-11","id":3236},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-15","id":3240},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-18","id":3243},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-22","id":3247},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-25","id":3250},"outcome":"NR"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-29","id":3254},"outcome":"NR"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-32","id":3257},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-36","id":3261},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-41","id":3266},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-47","id":3272},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-54","id":3279},"outcome":"W"}],"totalRunsFor":2028,"totalRunsAgainst":2002,"totalBallsFor":1425,"totalBallsAgainst":1417,"bowlAvg":"32.29032258064516","positionLabel":"Q","netRunRate":"+0.062","position":4,"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8},"played":14,"won":7,"lost":5,"tied":0,"points":16},{"noResult":1,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-01","id":3226},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-05","id":3230},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-14","id":3239},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-17","id":3242},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-19","id":3244},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-25","id":3250},"outcome":"NR"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-28","id":3253},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-30","id":3255},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-33","id":3258},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-38","id":3263},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-42","id":3267},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-44","id":3269},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-51","id":3276},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-54","id":3279},"outcome":"L"}],"totalRunsFor":2044,"totalRunsAgainst":2022,"totalBallsFor":1417,"totalBallsAgainst":1444,"bowlAvg":"25.59493670886076","positionLabel":"5","netRunRate":"+0.253","position":5,"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5},"played":14,"won":7,"lost":6,"tied":0,"points":15},{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-04","id":3229},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-08","id":3233},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-11","id":3236},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-13","id":3238},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-19","id":3244},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-23","id":3248},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-27","id":3252},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-34","id":3259},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-38","id":3263},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-41","id":3266},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-45","id":3270},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-48","id":3273},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-52","id":3277},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-56","id":3281},"outcome":"L"}],"totalRunsFor":2096,"totalRunsAgainst":2126,"totalBallsFor":1532,"totalBallsAgainst":1510,"bowlAvg":"26.911392405063292","positionLabel":"6","netRunRate":"-0.239","position":6,"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62},"played":14,"won":7,"lost":7,"tied":0,"points":14},{"noResult":1,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-02","id":3227},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-06","id":3231},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-10","id":3235},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-13","id":3238},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-17","id":3242},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-21","id":3246},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-26","id":3251},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-31","id":3256},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-36","id":3261},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-39","id":3264},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-42","id":3267},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-45","id":3270},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-49","id":3274},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-55","id":3280},"outcome":"NR"}],"totalRunsFor":1981,"totalRunsAgainst":1976,"totalBallsFor":1502,"totalBallsAgainst":1489,"bowlAvg":"26.7027027027027","positionLabel":"7","netRunRate":"-0.049","position":7,"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3},"played":14,"won":5,"lost":8,"tied":0,"points":11},{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-03","id":3228},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-07","id":3232},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-10","id":3235},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-14","id":3239},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-18","id":3243},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-24","id":3249},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-27","id":3252},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-31","id":3256},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-35","id":3260},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-40","id":3265},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-44","id":3269},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-48","id":3273},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-50","id":3275},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-53","id":3278},"outcome":"L"}],"totalRunsFor":2003,"totalRunsAgainst":2286,"totalBallsFor":1620,"totalBallsAgainst":1549,"bowlAvg":"32.65714285714286","positionLabel":"8","netRunRate":"-1.436","position":8,"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4},"played":14,"won":3,"lost":11,"tied":0,"points":6}]},{"groupName":"Playoffs","standings":[{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-57","id":3282},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-60","id":3285},"outcome":"W"}],"totalRunsFor":389,"totalRunsAgainst":323,"totalBallsFor":240,"totalBallsAgainst":240,"bowlAvg":"17.944444444444443","positionLabel":"1","netRunRate":"+1.650","position":1,"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6},"played":2,"won":2,"lost":0,"tied":0,"points":4},{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-58","id":3283},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-59","id":3284},"outcome":"L"}],"totalRunsFor":319,"totalRunsAgainst":249,"totalBallsFor":240,"totalBallsAgainst":239,"bowlAvg":"14.647058823529411","positionLabel":"2","netRunRate":"+1.724","position":2,"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9},"played":2,"won":1,"lost":1,"tied":0,"points":2},{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-57","id":3282},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-59","id":3284},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-60","id":3285},"outcome":"L"}],"totalRunsFor":463,"totalRunsAgainst":528,"totalBallsFor":359,"totalBallsAgainst":360,"bowlAvg":"27.789473684210527","positionLabel":"3","netRunRate":"-1.062","position":3,"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1},"played":3,"won":1,"lost":2,"tied":0,"points":2},{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-58","id":3283},"outcome":"L"}],"totalRunsFor":109,"totalRunsAgainst":180,"totalBallsFor":120,"totalBallsAgainst":120,"bowlAvg":"45.0","positionLabel":"4","netRunRate":"-3.550","position":4,"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8},"played":1,"won":0,"lost":1,"tied":0,"points":0}]}]
     */

    private TournamentIdBean tournamentId;
    private List<GroupsBean> groups;

    public static Standings objectFromData(String str, String key) {
        // expecting standings.json

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), Standings.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public TournamentIdBean getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(TournamentIdBean tournamentId) {
        this.tournamentId = tournamentId;
    }

    public List<GroupsBean> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupsBean> groups) {
        this.groups = groups;
    }

    public static class TournamentIdBean {
        /**
         * name : ipl2015
         * id : 2785
         */

        private String name;
        private int id;

        public static TournamentIdBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), TournamentIdBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static class GroupsBean {
        /**
         * standings : [{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-02","id":3227},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-04","id":3229},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-12","id":3237},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-15","id":3240},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-20","id":3245},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-24","id":3249},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-28","id":3253},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-30","id":3255},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-34","id":3259},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-37","id":3262},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-43","id":3268},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-47","id":3272},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-49","id":3274},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-53","id":3278},"outcome":"W"}],"totalRunsFor":2262,"totalRunsAgainst":2073,"totalBallsFor":1641,"totalBallsAgainst":1645,"bowlAvg":"22.0531914893617","positionLabel":"Q","netRunRate":"+0.709","position":1,"team":{"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1},"played":14,"won":9,"lost":5,"tied":0,"points":18},{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-01","id":3226},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-07","id":3232},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-09","id":3234},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-12","id":3237},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-16","id":3241},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-21","id":3246},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-23","id":3248},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-32","id":3257},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-35","id":3260},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-39","id":3264},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-43","id":3268},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-46","id":3271},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-51","id":3276},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-56","id":3281},"outcome":"W"}],"totalRunsFor":2345,"totalRunsAgainst":2371,"totalBallsFor":1636,"totalBallsAgainst":1646,"bowlAvg":"30.792207792207794","positionLabel":"Q","netRunRate":"-0.043","position":2,"team":{"shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","fullName":"Mumbai Indians","id":6},"played":14,"won":8,"lost":6,"tied":0,"points":16},{"noResult":2,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-05","id":3230},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-08","id":3233},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-16","id":3241},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-20","id":3245},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-22","id":3247},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-26","id":3251},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-29","id":3254},"outcome":"NR"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-33","id":3258},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-37","id":3262},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-40","id":3265},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-46","id":3271},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-50","id":3275},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-52","id":3277},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-55","id":3280},"outcome":"NR"}],"totalRunsFor":1790,"totalRunsAgainst":1693,"totalBallsFor":1147,"totalBallsAgainst":1220,"bowlAvg":"20.901234567901234","positionLabel":"Q","netRunRate":"+1.037","position":3,"team":{"shortName":"Challengers","abbreviation":"RCB","primaryColor":"D33F46","secondaryColor":"FFFFFF","type":"m","fullName":"Royal Challengers Bangalore","id":9},"played":14,"won":7,"lost":5,"tied":0,"points":16},{"noResult":2,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-03","id":3228},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-06","id":3231},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-09","id":3234},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-11","id":3236},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-15","id":3240},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-18","id":3243},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-22","id":3247},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-25","id":3250},"outcome":"NR"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-29","id":3254},"outcome":"NR"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-32","id":3257},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-36","id":3261},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-41","id":3266},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-47","id":3272},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-54","id":3279},"outcome":"W"}],"totalRunsFor":2028,"totalRunsAgainst":2002,"totalBallsFor":1425,"totalBallsAgainst":1417,"bowlAvg":"32.29032258064516","positionLabel":"Q","netRunRate":"+0.062","position":4,"team":{"shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","fullName":"Rajasthan Royals","id":8},"played":14,"won":7,"lost":5,"tied":0,"points":16},{"noResult":1,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-01","id":3226},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-05","id":3230},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-14","id":3239},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-17","id":3242},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-19","id":3244},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-25","id":3250},"outcome":"NR"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-28","id":3253},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-30","id":3255},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-33","id":3258},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-38","id":3263},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-42","id":3267},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-44","id":3269},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-51","id":3276},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-54","id":3279},"outcome":"L"}],"totalRunsFor":2044,"totalRunsAgainst":2022,"totalBallsFor":1417,"totalBallsAgainst":1444,"bowlAvg":"25.59493670886076","positionLabel":"5","netRunRate":"+0.253","position":5,"team":{"shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","fullName":"Kolkata Knight Riders","id":5},"played":14,"won":7,"lost":6,"tied":0,"points":15},{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-04","id":3229},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-08","id":3233},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-11","id":3236},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-13","id":3238},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-19","id":3244},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-23","id":3248},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-27","id":3252},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-34","id":3259},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-38","id":3263},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-41","id":3266},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-45","id":3270},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-48","id":3273},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-52","id":3277},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-56","id":3281},"outcome":"L"}],"totalRunsFor":2096,"totalRunsAgainst":2126,"totalBallsFor":1532,"totalBallsAgainst":1510,"bowlAvg":"26.911392405063292","positionLabel":"6","netRunRate":"-0.239","position":6,"team":{"shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","fullName":"Sunrisers Hyderabad","id":62},"played":14,"won":7,"lost":7,"tied":0,"points":14},{"noResult":1,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-02","id":3227},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-06","id":3231},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-10","id":3235},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-13","id":3238},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-17","id":3242},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-21","id":3246},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-26","id":3251},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-31","id":3256},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-36","id":3261},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-39","id":3264},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-42","id":3267},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-45","id":3270},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-49","id":3274},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-55","id":3280},"outcome":"NR"}],"totalRunsFor":1981,"totalRunsAgainst":1976,"totalBallsFor":1502,"totalBallsAgainst":1489,"bowlAvg":"26.7027027027027","positionLabel":"7","netRunRate":"-0.049","position":7,"team":{"shortName":"Daredevils","abbreviation":"DD","primaryColor":"B22E2A","secondaryColor":"FFFFFF","type":"m","fullName":"Delhi Daredevils","id":3},"played":14,"won":5,"lost":8,"tied":0,"points":11},{"noResult":0,"recentForm":[{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-03","id":3228},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-07","id":3232},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-10","id":3235},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-14","id":3239},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-18","id":3243},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-24","id":3249},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-27","id":3252},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-31","id":3256},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-35","id":3260},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-40","id":3265},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-44","id":3269},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-48","id":3273},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-50","id":3275},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-53","id":3278},"outcome":"L"}],"totalRunsFor":2003,"totalRunsAgainst":2286,"totalBallsFor":1620,"totalBallsAgainst":1549,"bowlAvg":"32.65714285714286","positionLabel":"8","netRunRate":"-1.436","position":8,"team":{"shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","fullName":"Kings XI Punjab","id":4},"played":14,"won":3,"lost":11,"tied":0,"points":6}]
         * groupName : Playoffs
         */

        private String groupName;
        private List<StandingsBean> standings;

        public static GroupsBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), GroupsBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public List<StandingsBean> getStandings() {
            return standings;
        }

        public void setStandings(List<StandingsBean> standings) {
            this.standings = standings;
        }

        public static class StandingsBean {
            /**
             * noResult : 0
             * recentForm : [{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-02","id":3227},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-04","id":3229},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-12","id":3237},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-15","id":3240},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-20","id":3245},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-24","id":3249},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-28","id":3253},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-30","id":3255},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-34","id":3259},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-37","id":3262},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-43","id":3268},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-47","id":3272},"outcome":"W"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-49","id":3274},"outcome":"L"},{"matchId":{"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-53","id":3278},"outcome":"W"}]
             * totalRunsFor : 2262
             * totalRunsAgainst : 2073
             * totalBallsFor : 1641
             * totalBallsAgainst : 1645
             * bowlAvg : 22.0531914893617
             * positionLabel : Q
             * netRunRate : +0.709
             * position : 1
             * team : {"shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"FFFFFF","type":"m","fullName":"Chennai Super Kings","id":1}
             * played : 14
             * won : 9
             * lost : 5
             * tied : 0
             * points : 18
             */

            private int noResult;
            private int totalRunsFor;
            private int totalRunsAgainst;
            private int totalBallsFor;
            private int totalBallsAgainst;
            private String bowlAvg;
            private String positionLabel;
            private String netRunRate;
            private int position;
            private TeamBean team;
            private int played;
            private int won;
            private int lost;
            private int tied;
            private int points;
            private List<RecentFormBean> recentForm;

            public static StandingsBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), StandingsBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public int getNoResult() {
                return noResult;
            }

            public void setNoResult(int noResult) {
                this.noResult = noResult;
            }

            public int getTotalRunsFor() {
                return totalRunsFor;
            }

            public void setTotalRunsFor(int totalRunsFor) {
                this.totalRunsFor = totalRunsFor;
            }

            public int getTotalRunsAgainst() {
                return totalRunsAgainst;
            }

            public void setTotalRunsAgainst(int totalRunsAgainst) {
                this.totalRunsAgainst = totalRunsAgainst;
            }

            public int getTotalBallsFor() {
                return totalBallsFor;
            }

            public void setTotalBallsFor(int totalBallsFor) {
                this.totalBallsFor = totalBallsFor;
            }

            public int getTotalBallsAgainst() {
                return totalBallsAgainst;
            }

            public void setTotalBallsAgainst(int totalBallsAgainst) {
                this.totalBallsAgainst = totalBallsAgainst;
            }

            public String getBowlAvg() {
                return bowlAvg;
            }

            public void setBowlAvg(String bowlAvg) {
                this.bowlAvg = bowlAvg;
            }

            public String getPositionLabel() {
                return positionLabel;
            }

            public void setPositionLabel(String positionLabel) {
                this.positionLabel = positionLabel;
            }

            public String getNetRunRate() {
                return netRunRate;
            }

            public void setNetRunRate(String netRunRate) {
                this.netRunRate = netRunRate;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public TeamBean getTeam() {
                return team;
            }

            public void setTeam(TeamBean team) {
                this.team = team;
            }

            public int getPlayed() {
                return played;
            }

            public void setPlayed(int played) {
                this.played = played;
            }

            public int getWon() {
                return won;
            }

            public void setWon(int won) {
                this.won = won;
            }

            public int getLost() {
                return lost;
            }

            public void setLost(int lost) {
                this.lost = lost;
            }

            public int getTied() {
                return tied;
            }

            public void setTied(int tied) {
                this.tied = tied;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }

            public List<RecentFormBean> getRecentForm() {
                return recentForm;
            }

            public void setRecentForm(List<RecentFormBean> recentForm) {
                this.recentForm = recentForm;
            }

            public static class TeamBean {
                /**
                 * shortName : Super Kings
                 * abbreviation : CSK
                 * primaryColor : FDB913
                 * secondaryColor : FFFFFF
                 * type : m
                 * fullName : Chennai Super Kings
                 * id : 1
                 */

                private String shortName;
                private String abbreviation;
                private String primaryColor;
                private String secondaryColor;
                private String type;
                private String fullName;
                private int id;

                public static TeamBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), TeamBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public String getShortName() {
                    return shortName;
                }

                public void setShortName(String shortName) {
                    this.shortName = shortName;
                }

                public String getAbbreviation() {
                    return abbreviation;
                }

                public void setAbbreviation(String abbreviation) {
                    this.abbreviation = abbreviation;
                }

                public String getPrimaryColor() {
                    return primaryColor;
                }

                public void setPrimaryColor(String primaryColor) {
                    this.primaryColor = primaryColor;
                }

                public String getSecondaryColor() {
                    return secondaryColor;
                }

                public void setSecondaryColor(String secondaryColor) {
                    this.secondaryColor = secondaryColor;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getFullName() {
                    return fullName;
                }

                public void setFullName(String fullName) {
                    this.fullName = fullName;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }
            }

            public static class RecentFormBean {
                /**
                 * matchId : {"tournamentId":{"name":"ipl2015","id":2785},"parentId":{"name":"ipl2015","id":2785},"name":"ipl2015-02","id":3227}
                 * outcome : W
                 */

                private MatchIdBean matchId;
                private String outcome;

                public static RecentFormBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), RecentFormBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public MatchIdBean getMatchId() {
                    return matchId;
                }

                public void setMatchId(MatchIdBean matchId) {
                    this.matchId = matchId;
                }

                public String getOutcome() {
                    return outcome;
                }

                public void setOutcome(String outcome) {
                    this.outcome = outcome;
                }

                public static class MatchIdBean {
                    /**
                     * tournamentId : {"name":"ipl2015","id":2785}
                     * parentId : {"name":"ipl2015","id":2785}
                     * name : ipl2015-02
                     * id : 3227
                     */

                    private TournamentIdBeanX tournamentId;
                    private ParentIdBean parentId;
                    private String name;
                    private int id;

                    public static MatchIdBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), MatchIdBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public TournamentIdBeanX getTournamentId() {
                        return tournamentId;
                    }

                    public void setTournamentId(TournamentIdBeanX tournamentId) {
                        this.tournamentId = tournamentId;
                    }

                    public ParentIdBean getParentId() {
                        return parentId;
                    }

                    public void setParentId(ParentIdBean parentId) {
                        this.parentId = parentId;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public static class TournamentIdBeanX {
                        /**
                         * name : ipl2015
                         * id : 2785
                         */

                        private String name;
                        private int id;

                        public static TournamentIdBeanX objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), TournamentIdBeanX.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }
                    }

                    public static class ParentIdBean {
                        /**
                         * name : ipl2015
                         * id : 2785
                         */

                        private String name;
                        private int id;

                        public static ParentIdBean objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), ParentIdBean.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }
                    }
                }
            }
        }
    }
}
