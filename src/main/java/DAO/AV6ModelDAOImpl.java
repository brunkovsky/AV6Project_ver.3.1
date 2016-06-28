package DAO;

import JDBC.ConnectionToDB;
import Model.AV6Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AV6ModelDAOImpl implements AV6ModelDAO {

    @Override
    public AV6Model createModel() {
        Connection connection = ConnectionToDB.getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.executeQuery("");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionToDB.closeConnection(connection);
        return null;
    }

    @Override
    public List<AV6Model> readAll() {
        List<AV6Model> result = new ArrayList<>();
        Connection connection = ConnectionToDB.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM table_av6;");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                Date date = resultSet.getTimestamp("date");
                String windDirectionName = resultSet.getString("wind_direction_name");
                Integer windSpeed = resultSet.getInt("wind_speed");
                if (resultSet.wasNull()) windSpeed = null;
                Integer windRush = resultSet.getInt("wind_rush");
                if (resultSet.wasNull()) windRush = null;
                Integer visibility = resultSet.getInt("visibility");
                if (resultSet.wasNull()) visibility = null;
                Integer octantsNumerator = resultSet.getInt("octants_numerator");
                if (resultSet.wasNull()) octantsNumerator = null;
                Integer octantsDenominator = resultSet.getInt("octants_denominator");
                if (resultSet.wasNull()) octantsDenominator = null;
                String cloudForm = resultSet.getString("cloud_form");
                Integer cloudiness = resultSet.getInt("cloudiness");
                if (resultSet.wasNull()) cloudiness = null;
                Double temperature = resultSet.getDouble("temperature");
                if (resultSet.wasNull()) temperature = null;
                Double dewPointTemperature = resultSet.getDouble("dew_point_temperature");
                if (resultSet.wasNull()) dewPointTemperature = null;
                Integer relativityHumidity = resultSet.getInt("relativity_humidity");
                if (resultSet.wasNull()) relativityHumidity = null;
                Double absoluteHumidity = resultSet.getDouble("absolute_humidity");
                if (resultSet.wasNull()) absoluteHumidity = null;
                Double atmospherePressure = resultSet.getDouble("atmosphere_pressure");
                if (resultSet.wasNull()) atmospherePressure = null;
                Double barometricTrend = resultSet.getDouble("barometric_trend");
                if (resultSet.wasNull()) barometricTrend = null;
                Double qnhGPa = resultSet.getDouble("qnh_gpa");
                if (resultSet.wasNull()) qnhGPa = null;
                Double qnhMm = resultSet.getDouble("qnh_mm");
                if (resultSet.wasNull()) qnhMm = null;
                Double qfe = resultSet.getDouble("qfe");
                if (resultSet.wasNull()) qfe = null;
                result.add(new AV6Model(id, date, windDirectionName, windSpeed, windRush, visibility, octantsNumerator, octantsDenominator, cloudForm, cloudiness, temperature, dewPointTemperature, relativityHumidity, absoluteHumidity, atmospherePressure, barometricTrend, qnhGPa, qnhMm, qfe));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionToDB.closeConnection(connection);
        return result;
    }

    @Override
    public void updateModelById(AV6Model av6Model) {
        Connection connection = ConnectionToDB.getConnection();
        try {
            PreparedStatement pStatement = connection.prepareStatement("UPDATE table_av6 SET date=?, wind_direction_name=?, wind_speed=?, wind_rush=?, visibility=?, octants_numerator=?, octants_denominator=?, cloud_form=?, cloudiness=?, temperature=?, dew_point_temperature=?, relativity_humidity=?, absolute_humidity=?, atmosphere_pressure=?, barometric_trend=?, qnh_gpa=?, qnh_mm=?, qfe=? WHERE id=?;");
            pStatement.setDate(1, new java.sql.Date(av6Model.getDate().getTime()));
            pStatement.setString(2, av6Model.getWindDirectionName());
            pStatement.setInt(3, av6Model.getWindSpeed());
            pStatement.setInt(4, av6Model.getWindRush());
            pStatement.setInt(5, av6Model.getVisibility());
            pStatement.setInt(6, av6Model.getOctantsNumerator());
            pStatement.setInt(7, av6Model.getOctantsDenominator());
            pStatement.setString(8, av6Model.getCloudForm());
            pStatement.setInt(9, av6Model.getCloudiness());
            pStatement.setDouble(10, av6Model.getTemperature());
            pStatement.setDouble(11, av6Model.getDewPointTemperature());
            pStatement.setInt(12, av6Model.getRelativityHumidity());
            pStatement.setDouble(13, av6Model.getAbsoluteHumidity());
            pStatement.setDouble(14, av6Model.getAtmospherePressure());
            pStatement.setDouble(15, av6Model.getBarometricTrend());
            pStatement.setDouble(16, av6Model.getQnhGPa());
            pStatement.setDouble(17, av6Model.getQnhMm());
            pStatement.setDouble(18, av6Model.getQfe());
            pStatement.setDouble(19, av6Model.getId());
            pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionToDB.closeConnection(connection);
    }

    @Override
    public void deleteModelById(int id) {
        Connection connection = ConnectionToDB.getConnection();
        try {
            PreparedStatement pStatement = connection.prepareStatement("DELETE FROM table_av6 WHERE id = ?;");
            pStatement.setInt(1, id);
            pStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionToDB.closeConnection(connection);
    }
}
